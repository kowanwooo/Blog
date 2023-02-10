<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="sc-iqseJM fYreJO">
		<h1>환영합니다!</h1>
		<div class="description">기본 회원 정보를 등록해주세요.</div>
		<div class="contents">
			<div class="sc-bqiRlB WKuYP">
				<div class="sc-crHmcD dSSeAk">
					<label>이름</label>
					<div class="group">
						<div class="input-wrapper">
							<input name="displayName" placeholder="이름을 입력하세요" size="20"
								value="이형석">
						</div>
						<div class="width-maker">${nickname}</div>
					</div>
				</div>
				<div class="sc-crHmcD dSSeAk">
					<label>아이디</label>
					<div class="group">
						<div class="input-wrapper">
							<input name="username" placeholder="아이디를 입력하세요" size="15"
								value="kowanwooo">
						</div>
						<div class="width-maker">kowanwooo</div>
					</div>
				</div>
				<div class="sc-crHmcD dSSeAk">
					<label>한 줄 소개</label>
					<div class="group">
						<div class="input-wrapper">
							<input name="shortBio" placeholder="당신을 한 줄로 소개해보세요" size="30"
								value="">
						</div>
						<div class="width-maker">당신을 한 줄로 소개해보세요</div>
					</div>
				</div>
				<div class="form-bottom">
					<div class="buttons">
						<button color="lightGray" class="sc-egiyK hxmXmL">취소</button>
						<button color="teal" type="submit" class="sc-egiyK iiYipF">다음</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>