package com.cap.rohit.SpringRest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Message {
 private long id;
 private String message;
 private Date created;
 private String author;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Message(long id, String message, String author) {
	super();
	this.id = id;
	this.message = message; 
	this.created =new Date();
	this.author = author;
}
public Message() {
	super();
}


 
}
