/**
 * 
 */
package com.example;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * @author Ire
 *
 */
@XmlRootElement
public class User {
	
	private Integer id = null;
	private String username = null;
	
	
	
	public User() {
		super();
	}
	
	

	/**
	 * @param id
	 * @param username
	 */
	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}



	/**
	 * @param username
	 */
	public User(String username) {
		super();
		this.username = username;
	}



	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
