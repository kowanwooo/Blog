<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="card" style="width: 18rem;">
	<img src="..." class="card-img-top" alt="...">
	<div class="card-body">
		<h5 class="card-title">Card title</h5>
		<p class="card-text">Some quick example text to build on the card
			title and make up the bulk of the card's content.</p>
	</div>
	<ul class="list-group list-group-flush">
		<li class="list-group-item"><a href="/post/${post.postId}">
				지역 : ${post.title} </a></li>
		<li class="list-group-item">종류 : ${post.content}</li>
		<li class="list-group-item">사례금 : ${post.createAt}</li>
	</ul>
	<div class="card-body"></div>
</div>
