<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>환영합니다!  ${nickname}님</h1>
	<h3>기본 회원 정보를 등록해주세요.</h3>
	이름
	<input type="text" value="${nickname}">
	아이디
	<input type="text" placeholder="아이디">
	한 줄 소개
	<input type="text" placeholder="당신을 한 줄로 소개해보세요">
	<button>취소</button>
	<button>다음</button>
	<img src="${profile_image}" width="30px">
</body>
</html>