package com.javaex.ex02;

public class AuthorVo {

	//필드
	private int authorId;
	private String authorNmae;
	private String authorDesc;
	
	
	
	
	
	
	//생성자
	public AuthorVo() {
	}
	
	public AuthorVo(int authorId, String authorNmae, String authorDesc) {
		super();
		this.authorId = authorId;
		this.authorNmae = authorNmae;
		this.authorDesc = authorDesc;
	}
	
	
	
	
	
	
	
	
	//메소드 G/S
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorNmae() {
		return authorNmae;
	}

	public void setAuthorNmae(String authorNmae) {
		this.authorNmae = authorNmae;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	
	
	
	
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "AuthorVo [authorId=" + authorId + ", authorNmae=" + authorNmae + ", authorDesc=" + authorDesc + "]";
	}
	
	

}
