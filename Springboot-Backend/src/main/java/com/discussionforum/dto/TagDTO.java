package com.discussionforum.dto;

import java.util.Date;

public class TagDTO {

	private String name;
	
	private String username;
	
	private Date date_created;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	@Override
	public String toString() {
		return "TagDTO [name=" + name + ", username=" + username + ", date_created=" + date_created + "]";
	}
	
	
}
