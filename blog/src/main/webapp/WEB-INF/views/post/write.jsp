<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Page Title</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>

<style>
#editor {
	width: 100%;
	margin: 0 auto;
}

#contents {
	width: 100%;
	height: 100px;
	margin: 30px auto;
	border: 1px solid;
}
</style>

<!-- TOAST UI Editor CDN URL -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.48.4/codemirror.min.css" />
<link rel="stylesheet"
	href="https://uicdn.toast.com/editor/latest/toastui-editor.min.css" />
<script src="http://code.jquery.com/jquery-3.2.1.js"></script>
</head>
<body>
	<h1>제목</h1>
	<input type="text" placeholder="제목을 적어주세요">
	<h2>내용</h2>
	<!-- TOAST UI Editor가 들어갈 div태그 -->
	<div id="editor"></div>
	<button onClick="location.href='/'">뒤로가기</button>
	<button>출간하기</button>
	<!-- !!여기!! 에디터 내용을 받을 div태그-->
	<div id="contents"></div>
	<!-- TOAST UI Editor CDN URL(JS) -->
	<script
		src="https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js"></script>

	<!-- TOAST UI Editor 생성 JavaScript 코드 -->
	<script>
		const editor = new toastui.Editor({
			el : document.querySelector('#editor'),
			previewStyle : 'vertical',
			height : '700px',
			// placeholder
			initialValue : '내용을 적어주세요.',
			// 이미지가 Base64 형식으로 입력되는 것 가로채주는 옵션
			hooks: {
		    	addImageBlobHook: (blob, callback) => {
		    		// blob : Java Script 파일 객체
		    		//console.log(blob);
		    		
		    		const formData = new FormData();
		        	formData.append('image', blob);
		        	
		        	let url = '/resources/img/';
		   			$.ajax({
		           		type: 'POST',
		           		enctype: 'multipart/form-data',
		           		url: '/post/writeTest.do',
		           		data: formData,
		           		dataType: 'json',
		           		processData: false,
		           		contentType: false,
		           		cache: false,
		           		timeout: 600000,
		           		success: function(data) {
		           			console.log('ajax 이미지 업로드 성공');
		           			url += data.filename;
		           			
		           			// callback : 에디터(마크다운 편집기)에 표시할 텍스트, 뷰어에는 imageUrl 주소에 저장된 사진으로 나옴
		        			// 형식 : ![대체 텍스트](주소)
		           			callback(url, '');
		           		},
		           		error: function(e, statusText) {
// 		           			console.log('ajax 이미지 업로드 실패');
		           			console.log(e.abort([statusText]));
		           			
		           			callback('image_load_fail', '');
		           		}
		           	});
		    	}
		    
			}
		});

		
		
		// editor.getHTML()을 사용해서 에디터 내용 받아오기
		btnEle = document.querySelector('#contents');
		btnEle.addEventListener("click", function() {
			document.querySelector('#contents').insertAdjacentHTML('afterbegin',
					editor.getHTML());
			console.log(editor.getHTML());
		});
	</script>
</body>
</html>