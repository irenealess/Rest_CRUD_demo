/**
 * 
 */
package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ire
 *
 */
public class UserDAO {

	  private static final long serialVersionUID = 1L;
	
	//private List<User> users = null; 
	
	/**
	 * 
	 */
	public UserDAO() {
		// TODO Auto-generated constructor stub
		//users = new ArrayList();
	}
	
	public static List<User> getUsers(){
		
		Connection conn = DBConector.connection();
		Statement stmt = null;
		List<User> users = new ArrayList();
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from USER";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         String username = rs.getString("username");
		         users.add(new User(id,username));
			}    			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return users;
		}
		
		return users;
	}
	
	public User getUserById(Integer id){
		//todo
		User user = new User("username2");
		return user;
	}

}
