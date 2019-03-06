package com.discussionforum.dto;

import java.util.Date;

public class QuestionDTO {

	private Long id;

	 private String title;

	 private String body;

	 private Date dateCreated;

	 private Long user;

	 private Long tag;

	 private int answerCount;

	 private int viewCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public Long getTag() {
		return tag;
	}

	public void setTag(Long tag) {
		this.tag = tag;
	}

	public int getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public String toString() {
		return "QuestionDTO [id=" + id + ", title=" + title + ", body=" + body + ", dateCreated=" + dateCreated
				+ ", user=" + user + ", tag=" + tag + ", answerCount=" + answerCount + ", viewCount=" + viewCount + "]";
	}
	
	
}
