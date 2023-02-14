package com.rock.blog.post;

import java.util.Date;

public class PostVO {
	private Long postId;
	private String title;
	private String content;
	private Date createdAt;
	private String thumbnail;
	
	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
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

	public Date getCreateAt() {
		return createdAt;
	}

	public void setCreateAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@Override
	public String toString() {
		return "PostVO [postId=" + postId + ", title=" + title + ", content=" + content + ", createdAt=" + createdAt
				+ "]";
	}
	
	
}
