<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="header">
		<div class="header_wrap">
			<div class="header_title">
				<a href="/blog/index.jsp">Blog</a>
			</div>
			<div>
				<button>
					<div>
						<div>해,달</div>
					</div>
				</button>
				<a href="/search">검색</a>
				<button class="header_login_btn btn btn-primary"
					data-bs-toggle="modal" data-bs-target="#staticBackdrop">로그인</button>
			</div>
		</div>
	</div>


	<!-- Modal -->
	<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static"
		data-bs-keyboard="false" tabindex="-1"
		aria-labelledby="staticBackdropLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">...</div>
	</div>

	<!-- 카카오 로그인 -->
	<a class="p-2"
		href="https://kauth.kakao.com/oauth/authorize?
		client_id=cbb14ffbd400c4cf6137e3aa91ca7a34&
		redirect_uri=http://localhost:8087/blog/kakaoLogin&response_type=code">
		<img src="resources/img/kakao_login.png" style="height: 50px">
	</a>
</body>
</html>