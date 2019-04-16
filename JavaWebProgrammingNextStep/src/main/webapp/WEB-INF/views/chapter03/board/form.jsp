<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>

</style>

<div class="form_frame">
	<div class="form_content">
		<div class="board_title">
			<h1>${board.title }</h1>
		</div>
		
		<div class="board_content">
			<div class="user_info">
				[이미지]${board.userId }<br/>
				${board.createdDate }
			</div>
			
			<div class="user_content">
				${board.content }
			</div>
			<div>
				<button>수정</button>
				<button>삭제</button>
				<button>목록</button>
			</div>
		</div>
		
		<div class="board_reply_frame">
			댓글 영역
		</div>
		
	</div>
</div>


