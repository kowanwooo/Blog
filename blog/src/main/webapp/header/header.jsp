<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String userNickName = (String) session.getAttribute("userNickName");
%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
<script src="http://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		$(".header_logout_btn").on("click", function() {
			$.ajax({
				url : "/user/logout",
				success : function() {
					window.location = '/';
				}
			})
		});

	})
</script>
<div class="header">
	<div class="header_wrap">
		<div class="header_title">
			<a href="/">Blog</a>
		</div>
		<div>
			<button class="header_search_btn"
				onClick="location.href='/post/search'">검색</button>
			<c:choose>
				<c:when test="${empty userNickName}">
					<button class="header_login_btn" data-bs-toggle="modal"
						data-bs-target="#exampleModal">로그인</button>
				</c:when>
				<c:otherwise>
					<!-- <a href="/post/write">글쓰기</a> -->
					<button class="header_write_btn"
						onClick="location.href='/post/write'">글쓰기</button>
					<button class="header_logout_btn"
						onClick="location.href='/user/logout'">로그아웃</button>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<div class="modal-header">
				<h1 class="modal-title fs-5" id="exampleModalLabel">로그인</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<form action="login.jsp" method="post">
					<div class="mb-3">
						<label class="form-label" for="id">아이디</label> <input
							class="form-control" type="text" name="id" id="id" />
					</div>
					<div class="mb-3">
						<label class="form-label" for="pwd">비밀번호</label> <input
							class="form-control" type="password" name="pwd" id="pwd" />
					</div>
					<button class="btn btn-outline-primary btn-sm" type="submit">로그인</button>
				</form>
				<!-- 카카오 로그인 -->
				<a class="p-2"
					href="https://kauth.kakao.com/oauth/authorize?
		client_id=cbb14ffbd400c4cf6137e3aa91ca7a34&
		redirect_uri=http://localhost:8087/post/kakaoLogin&response_type=code">
					<img src="../../../resources/img/kakao_login.png" style="height: 50px">
				</a>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary"
					data-bs-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save changes</button>
			</div>
		</div>
	</div>
</div>
