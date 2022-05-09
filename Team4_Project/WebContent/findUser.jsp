<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="d-flex flex-column justify-content-center align-items-center viewContainer">
		<div class="d-flex flex-column justify-content-center align-items-center">
			<div class="d-flex flex-column justify-content-center align-items-center">
				<h1><b>아이디 찾기</b></h1>
			</div>
			<div class="p-2 container mt-3 submitFormContainer">
			  <form action="/action_page.php" class="submitForm">
			    <div class="d-flex mb-3 mt-3">
			      <label for="id">이름</label>
			      <input type="text" class="form-control userInput" id="id" placeholder="Enter name" name="id">
			    </div>
			    <div class="d-flex mb-3">
			      <label class="searchLabel" for="pwd">이메일 또는  전화번호</label>
			      <input type="password" class="form-control userInput" id="pw" placeholder="Enter password" name="pw">
			    </div>
			    <button type="submit" class="btn btn-primary w-100 submitBtn">아이디 찾기</button>
			  </form>
			</div>
			<div class="d-flex justify-content-around w-100" >
				<span class="descSpan">* 아이디가 이메일로 전송 됩니다.</span>
			</div>
			<hr />
			<div class="d-flex flex-column justify-content-center align-items-center">
				<h1><b>비밀번호 찾기</b></h1>
			</div>
				<div class="p-2 container mt-3 submitFormContainer">
			  <form action="/action_page.php" class="submitForm">
			    <div class="d-flex mb-3 mt-3">
			      <label for="id">이름</label>
			      <input type="text" class="form-control userInput" id="id" placeholder="Enter name" name="id">
			    </div>
			    <div class="d-flex mb-3">
			      <label class="searchLabel" for="pwd">이메일 또는 전화번호 </label>
			      <input type="password" class="form-control userInput" id="pw" placeholder="Enter password" name="pw">
			    </div>
			    <div class="d-flex mb-3">
			      <label class="searchLabel" for="pwd">인증번호 </label>
			      <input type="password" class="form-control userInput" id="pw" placeholder="Enter number" name="pw">
			    </div>
			    <button type="submit" class="btn btn-primary w-100 submitBtn">비밀번호 찾기</button>
			  </form>
			</div>
			<div class="d-flex justify-content-around w-100" >
				<span class="descSpan">* 무작위 비밀번호가 이메일로 전송됩니다.</span>
			</div>
		</div>
	</div>
</body>
<style type="text/css">
	label{
		min-width: 35%;
		text-align:center;
	}
	.submitBtn{
		background-color: #FFD7D7;
		border-color: #FFD7D7;
		font-weight: bolder;
		color: black;
	}
	.submitForm{
		margin: 10px 20px;
	}
	.userInput{
		background-color: #C4C4C4;
		border-color: #C4C4C4;
	}
	.viewContainer{
		width: 100vw;
		height: 100vh;
		background-color: #FFF8EB;
	}
	.submitFormContainer{
		background-color: #FFFFFF;
		width: 90vw;
	}
	.descSpan{
		margin-top: 10px;
		font-size: 4vw;
	}
	.searchLabel{
		text-align:center;
		font-size: smaller;
	}
	hr{
		width: 90vw;
		border: 2px solid #000000;
	}
	
</style>
</html>