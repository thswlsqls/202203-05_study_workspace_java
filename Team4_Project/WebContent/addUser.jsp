<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->
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
				<h1><b>회원가입</b></h1>
			</div>
			<div class="p-2 container mt-3 submitFormContainer">
			  <form action="/action_page.php" class="submitForm">
			    <div class="d-flex mb-3 mt-3">
			      <label for="id">*ID</label>
			      <input type="text" class="form-control userInput" id="id" placeholder="8~15자 영,숫자 포함" name="id">
			      <button type="button" class="btn btn-secondary checkDuplBtn">중복확인</button>
			    </div>
			    <div class="d-flex mb-3 mt-3">
			      <label for="id">*이름</label>
			      <input type="text" class="form-control userInput" id="id" placeholder="2~10자 특수문자 불가" name="id">
			    </div>
			    <div class="d-flex mb-3">
			      <label for="pwd">*PW </label>
			      <input type="password" class="form-control userInput" id="pw" placeholder="8~15자 영,숫자 필수 포함" name="pw">
			    </div>
			    <div class="d-flex mb-3">
			      <label for="pwdCheck" class="pwChkLabel">비밀번호확인 </label>
			      <input type="password" class="form-control userInput" id="pw" placeholder="8~15자 영,숫자 필수 포함" name="pw">
			    </div>
			    <div class="d-flex mb-3">
			      <label for="pwdCheck" class="pwChkLabel">*필명 </label>
			      <input type="text" class="form-control userInput" id="nickName" placeholder="2~10자 특수문자 불가" name="pw">
			      <button type="button" class="btn btn-secondary checkDuplBtn">중복확인</button>
			    </div>
			    <div class="d-flex mb-3">
			      <label for="pwdCheck" class="pwChkLabel">*이메일 </label>
			      <input type="text" class="form-control userInput"  placeholder="Enter id" id="emailId" name="emailId">
			      @
			      <select class="form-select userInput">
					<option>naver.com</option>
					<option>gmail.com</option>
				    <option>daum.net</option>
				  </select>
			    </div>
			    <div class="d-flex mb-3">
			      <label for="pwdCheck" class="pwChkLabel">전화번호 </label>
			      <input type="text" class="form-control userInput" id="nickName" placeholder="-없이 숫자만 입력" name="pw">
			    </div>
			    <div class="d-flex form-check mb-3">
			      <span style="width: 100%; text-align:right; font-size: 2vw;">‘*’는 필수 입력사항입니다.</span>
			    </div>
			  </form>
			</div>
			<div class="p-2" >
				<button type="button" class="btn btn-secondary submitBtn">가입완료</button>
			</div>
		</div>
	</div>
</body>
<style type="text/css">
	label{
		text-align:center;
		min-width: 24%;
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
		font-size: 2vw;
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
	.checkDuplBtn{
		background-color: #C4C4C4;
		border-color: #C4C4C4;
		color: black;
		font-weight: bolder;
		margin-left: 10px;
		font-size: 2vw;
		min-width: 25%;
	}
	.pwChkLabel{
		text-align:center;
		font-size: smaller;
	}
</style>
</html>