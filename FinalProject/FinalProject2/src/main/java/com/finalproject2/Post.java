package com.finalproject2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "/post")
public class Post {
	//id
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
	
	private String message;
	
	public void setId(Integer id) {		
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	//authorId
	
	//message
	//timeStamp

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
