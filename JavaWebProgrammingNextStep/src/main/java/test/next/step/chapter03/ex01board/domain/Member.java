package test.next.step.chapter03.ex01board.domain;

import java.io.File;

public class Member {
	private long memberId;
	private String userId;
	private String password;
	private String email;
	private String image;
	
	public Member() { }
	public Member(long memberId, String userId, String password, String email) {
		this.memberId = memberId;
		this.userId = userId;
		this.password = password;
		this.email = email;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageSrc() {
		String imageSrc = "";
		String uploadBaseFolder = "/upload";
		
		if (image != null && image != "") {
			imageSrc = uploadBaseFolder + "/" + userId
					 + "/profile/" + image; 
		} else {
			// imageSrc = uploadRoot + uploadBaseFolder + "/" + "기본이미지";
		}
		
		return imageSrc;
	}
}
