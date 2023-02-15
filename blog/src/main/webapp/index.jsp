<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script src="http://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {

		$.ajax({
			url : "/post/",
			success : function(table) {
				$("#result").html(table)
			}
		})
	})
</script>
</head>
<body>
	<div id="root">
		<!-- 헤더 -->
		<jsp:include page="./header/header.jsp"></jsp:include>
		<!-- 	리스트 -->
		<div class="main_list">
			<!--navTab  -->
			<ul class="nav nav-tabs">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">트렌딩</a></li>
				<li class="nav-item"><a class="nav-link" href="#">최신</a></li>
			</ul>
			<div class="list_wrap">
				<div class="list_flex">
					<div id="result"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>