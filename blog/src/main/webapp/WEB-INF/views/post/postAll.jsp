<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${post}" var="post" varStatus="status">
	<!--card  -->
	<div id="card_style" class="card">
		<img src="${post.thumbnail}" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">
				<a href="/post/${post.postId}">${post.title} </a>
			</h5>
			<p class="card-text">Some quick example text to build on the card
				title and make up the bulk of the card's content.</p>
		</div>
		<ul class="list-group list-group-flush">
			<li class="list-group-item">사례금 : ${post.createAt}</li>
		</ul>
	</div>
</c:forEach>