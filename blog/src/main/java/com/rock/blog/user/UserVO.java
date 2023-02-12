package com.rock.blog.user;

public class UserVO {
	private Long userId;
	private String nickname;
	private String userName;
	private String introduce;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", nickname=" + nickname + ", userName=" + userName + ", introduce="
				+ introduce + "]";
	}
}
