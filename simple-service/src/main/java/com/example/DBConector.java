package com.example;

import java.sql.*;

public class DBConector {

	private static String servidor="jdbc:mysl://localhost/test";
	private static String user="root";
	private static String pass="";
	private static String driver="com.mysql.jdbc.Driver";
	private static String connection = null;
	private static Connection conn = null; 
	
	public static boolean driver (){		
		try {
			
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    return true;

			} catch (Exception e) {		
				//no encuentra el driver
			    System.out.println(e.toString());
			    return false;
			}
	}
	
   /*
    * Creates database connection
    */
	public static Connection connection(){		
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"+ "user=root&password=");		 
		}catch(SQLException ex){
			System.out.println("SQLException: " + ex.getMessage());
		}
		return conn;		
	}
	
   /*
	* Creates USER table on test database
	*/
	public static boolean createTable(){
		Statement stmt = null;
		try{
               connection();
               stmt = conn.createStatement();
               String sql = "CREATE TABLE  IF NOT EXISTS USER " +
                       "(id int NOT NULL AUTO_INCREMENT, " +
                       " username VARCHAR(50), " + 
                       " PRIMARY KEY ( id ))"; 
               
               int i = stmt.executeUpdate(sql);
               System.out.println("Created table in given database...");
               
		}catch(Exception ex){
			System.out.println("Exception - createTable: " + ex.getMessage());
			return false;
		}		
		return true;
	}
	
}