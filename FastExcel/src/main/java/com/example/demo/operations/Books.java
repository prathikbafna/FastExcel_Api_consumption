package com.example.demo.operations;

public class Books {
	
	
	public Books() {}

	
	public Books(String bookId, String bookName, String bookAuthor, Boolean bookAvbl) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		BookAvbl = bookAvbl;
	}


	private String bookId;
	
	private String bookName;
	
	private String bookAuthor;
	
	private Boolean BookAvbl;
	
	private Users usr;
	
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
