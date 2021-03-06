<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="login_form">
	<c:choose>
		<c:when test="${not empty userId}">
			이미 로그인되셨슈
		</c:when>
		<c:otherwise>
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
		</c:otherwise>
	</c:choose>
</div>

<script type="text/javascript">

$(document).ready(function() {
	
});

function loginTest() {
	var isSuccess = false;
	
	$.ajax({
		type: 'POST',
		url: 'login',
		dataType: 'json',
		data: $('#form').serialize(),
		success: function(response) {
			if (response) {
				isSuccess = true;
				alert("로그인 성공하셨습니다.");
				window.location.reload();
			} else {
				alert("로그인 실패하셨습니다.");
			}
			
		}
	});
	
	return isSuccess;
}


</script>