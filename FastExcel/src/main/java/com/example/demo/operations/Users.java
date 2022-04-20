package com.example.demo.operations;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.ToString;

@ToString()
@Data
public class Users {

	public Users(String userId, String userName, String userClg, String userContact, Set<Books> bks) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userClg = userClg;
		this.userContact = userContact;
		this.bks = bks;
	}
	
	
	public Users(String userId, String userName, String userClg, String userContact) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userClg = userClg;
		this.userContact = userContact;
	}


	public Users() {
	}


	
	private String userId;
	
	private String userName;
	
	private String userClg;
	
	private String userContact;
	
	public Set<Books> bks = new HashSet<Books>();
	
public String jsonifyObj(Users u) {
		
		String res ="{" +
		    "userId" + ":" + u.getUserId() + "," +
		    "userName"+ ":" + u.getUserName() + "," +
		    "userClg" + ":" + u.getUserClg() + "," +
		    "userContact"+ ":" + u.getUserContact() + "," +
		    "bks" + ":" + "[" + u.getBks() + "]" +
		"}";
		return res;
		
}
	
}
