<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/css/index.css">
</head>
<body>
	<jsp:include page="../../../header/header.jsp"></jsp:include>
	<div class="postOne">
		<div class="postOne_wrap">
			<h1>${post.title}</h1>
			<ul>
				<li>${post.content}</li>
				<li>${post.createAt}</li>
			</ul>
		</div>
	</div>
</body>
</html>