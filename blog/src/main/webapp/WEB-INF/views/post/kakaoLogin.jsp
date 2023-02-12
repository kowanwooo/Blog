<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#submit_btn").on("click", function() {
			$.ajax({
				url : "/user/register",
				data : {
					nickname : $('input[name=nickname]').val(),
					userName : $('input[name=userName]').val(),
					introduce: $('input[name=introduce]').val(),
				},
				success : function() {
					window.location = '/';
				}
			})
		});
			
	})
</script>
</head>
<body>
	<div class="sc-iqseJM fYreJO">
		<h1>환영합니다!</h1>
		<div class="description">기본 회원 정보를 등록해주세요.</div>
		<div class="contents">
			<div class="sc-bqiRlB WKuYP">
				<div class="sc-crHmcD dSSeAk">
					<label>닉네임</label>
					<div class="group">
						<div class="input-wrapper">
							<input name="nickname" placeholder="이름을 입력하세요" size="20"
								value="${nickname}">
						</div>
					</div>
				</div>
				<div class="sc-crHmcD dSSeAk">
					<label>아이디</label>
					<div class="group">
						<div class="input-wrapper">
							<input name="userName" placeholder="아이디를 입력하세요" size="15">
						</div>
					</div>
				</div>
				<div class="sc-crHmcD dSSeAk">
					<label>한 줄 소개</label>
					<div class="group">
						<div class="input-wrapper">
							<input name="introduce" placeholder="당신을 한 줄로 소개해보세요" size="30"
								value="">
						</div>
					</div>
				</div>
				<div class="form-bottom">
					<div class="buttons">
						<button color="lightGray">취소</button>
						<button id="submit_btn" color="teal" type="button">다음</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>