package com.rock.blog.post;

public class PostVO {
	private Long postId;
	private Long userId;
	private String title;
	private String content;
	private String createAt;
	private String thumbnail;
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	@Override
	public String toString() {
		return "PostVO [postId=" + postId + ", userId=" + userId + ", title=" + title + ", content=" + content
				+ ", createAt=" + createAt + ", thumbnail=" + thumbnail + "]";
	}

	

}
