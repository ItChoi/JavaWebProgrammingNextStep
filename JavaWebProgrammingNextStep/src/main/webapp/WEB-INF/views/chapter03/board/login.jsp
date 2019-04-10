<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="login_form">
	<form id="form" action="list" method="get" onsubmit="return loginTest();">
		<label for="userId">
			사용자 아이디
		</label>
		<input type="text" name="userId" id="userId" /> <br/>
		
		<label for="password">
			비밀번호
		</label>
		<input type="password" name="password" id="password" />
		<br/>
		<input type="submit" value="로그인" />
	</form>
</div>

<script type="text/javascript">

$(document).ready(function() {
	
});

function loginTest() {
	var isSuccess = false;
	
	$.ajax({
		type: 'POST',
		url: 'login',
		data: $('#form').serialize(),
		success: function(result) {
			console.log(result);
			console.log(result.value);
			console.log(result.val());
			console.log(result.loginTest);
			console.log(result.data);
			
			if (result.loginTest) {
				isSuccess = true;
				alert("로그인 성공하셨습니다.");
			} else {
				alert("로그인 실패하셨습니다.");
			}
			
		}
	});
	
	return isSuccess;
}


</script>