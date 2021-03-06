<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
	.wrap {
		margin: 0 auto;
		width: 800px;
		height: 800px;
		border: 1px solid black;
	}
	
	.header {
		margin: 5px 5px 2px 5px;
		height: 100px;
		border: 1px solid black;
		text-align: center;
		line-height: 100px;
	}
	
	.title1, .title2 {
		margin: 0px;
	}
	
	.nav {
		margin: 5px 5px 2px 5px;
		height: 100px;
		border: 1px solid black;
		text-align: center;
		line-height: 50px;
	}
	
	.menu {
		margin 0px;
		display: inline-block;
		width: 100px; 
		height: 30px; 
		border: 1px solid black;
		line-height: 30px;
	}

	.content_wrap {
		margin: 5px 5px 2px 5px;
		border-top: 1px solid black;
		height: 575px;
		overflow: hidden;
	}
	
	.content {
		margin: 5px 5px 2px 5px;
		width: 700px;
		float: left;
		height: 563px;
		border: 1px solid black; 
		overflow: hidden;
	}
	
	.banner { 
		margin: 5px 5px 2px 5px;
		width: 60px;
		float: left;
		height: 563px;
		border: 1px solid black;
		text-align: center;
		line-height: 563px;
	}

	.login_form {
		text-align: center;
		
	}

</style>

</head>
<body>
	
	<div class="wrap">
		<div class="header">
			<p class="title1">header</p>
		</div>
		
		<div class="nav">
			<div class="title2">navigation</div>
			<div class="menu menu1" onclick="menuChange('posts')">Posts</div>
			<div class="menu menu2" onclick="menuChange('register')">회원가입</div>
			<div class="menu menu3" onclick="menuChange('login')">로그인</div>
			<div class="menu menu4" onclick="menuChange('logout')">로그아웃</div>
			<div class="menu menu5" onclick="menuChange('info')">개인정보수정</div>
		</div>
		
		<div class="content_wrap">
			<div class="content">
				
			</div>
			
			<div class="banner">
				광고
			</div>
		</div>
		
	</div>

<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		menuChange('posts');
	});
	
	function menuChange(type) {
		$(".content").empty();
		$.ajax({
			type: 'get',
			url: type,
			dataType: 'html',
			success: function(html) {
				$(".content").append(html);
			}
			
		});
	}
</script>

</body>
</html>