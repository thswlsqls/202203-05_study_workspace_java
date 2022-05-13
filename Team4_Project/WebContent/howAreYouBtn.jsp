<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Koulen&family=Roboto+Mono:ital,wght@1,300&display=swap" rel="stylesheet">
</head>
<body>

<style type="text/css"">
	.themaBtn{
		width: 100vw;
		height: 10vh;
		border: none;
		position: fixed;
		z-index: 100;
		text-align: center;
		display: inline-block;
		font-size: large;
		font-family: 'Koulen', cursive;
		font-family: 'Roboto Mono', monospace;
	}

</style>
<button class="nav themaBtn" onclick="location.href='controller?cmd=boardThemeListUI'">
	<h1>How Are You?</h1>
</button>

</body>
</html>