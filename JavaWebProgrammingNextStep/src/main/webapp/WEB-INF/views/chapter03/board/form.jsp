<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
.form_frame {
	width: 100%;
	height: 100%;
	text-align: center;
}

.form_content {
	width: 100%;
	height: 100%;
}

.board_title, .board_content {
	margin-bottom: 30px;
	border-bottom: 3px solid gray;
}

.board_content, .board_reply_frame, .reply_content {
	text-align: left;
}

.user_info {
	overflow: hidden;
}

.image_frame {
	float: left;
}

.info_frame {
	float: left;
}

.zzz {
	margin: 0px;
}

.user_info, .reply_count {
	border-bottom: 1px dotted gray;
}

.user_content {
	margin: 0px;
}

.reply_count {
	text-align: left;
}

.reply_content {
	text-align: center;
	overflow: hidden;
}

.board_reply_frame {
	height: 100%;
	overflow: scroll;
}



h1 {
	margin-top: 0px;
}

.board_title {
	height: 10%;
}

.board_content {
	height: 40%; 
}

.board_reply_frame {
	height: 40%;
}

.bold {
	font: bold;
}

.replyer_info {
	width: 20%;
}

.reply_info {
	width: 20%;
	border-right: 1px solid black;
	float: left;
}

.user_content {
	width: 59%;
	float: left;
}

.tete {
	width: 17%;
	float: left;
}

.btn_height {
	height: 37.6px;
} 


</style>

<div class="form_frame">
	<div class="form_content">
		<div class="board_title">
			<h1>${board.title }</h1>
		</div>
		
		<div class="board_content">
			<div class="board_info">
				<div class="user_info">
					<div class="image_frame">
						<img src="${board.imageSrc}" width="48px;" height="48px;" alt="이미지"/>
					</div>
					<div class="info_frame">
						<p class="zzz">${board.userId }</p>
						<p class="zzz">${board.createdDate }</p>
					</div>
				</div>
			</div>
			
			<div class="user_content">
				<p>${board.content }</p>
				<div class="xxx">
					<button>수정</button>
					<button>삭제</button>
					<button>목록</button>
				</div>
			</div>
		</div>
		
		<div class="board_reply_frame">
			<div class="reply_count">
				<span class="bold">${boardReplyCount }</span>의 의견
			</div>
			
			
			<c:forEach var="reply" items="${boardReplyList }">
				<div class="board_info">
					<div class="user_info">
						<div class="image_frame">
							<img src="${board.imageSrc}" width="48px;" height="48px;" alt="이미지"/>
						</div>
						<div class="info_frame">
							<p class="zzz">${board.userId }</p>
							<p class="zzz">${board.createdDate }</p>
						</div>
						
						<div class="user_content">
							<p>${board.content }</p>
							<div class="xxx">
								<button>수정</button>
								<button>삭제</button>
							</div>
						</div>
					</div>
				</div>
				
			</c:forEach>
			
			
			
			<div class="reply_content">
				<c:forEach var="boardReply" items="${boardReply }">
					<c:choose>
						<c:when test="${boardReply.replyLevel eq 1 }">
							<div class="reply_content">
								<div class="reply_info">
									<div class="user_info">
										<div class="info_frame">
											<div class="zzz">${board.userId }</div>
											<div class="zzz">${board.createdDate }</div>
										</div>
									</div>
								</div>
								
								<div class="user_content">
									<p>${board.content }</p>
								</div>
								<div class="xxx tete">
									<button class="btn_height">수정</button>
									<button class="btn_height">목록</button>
								</div>
							</div>
							
						</c:when>
						
						<c:otherwise>
							<div class="reply_content" style="margin-left: 20px;">
								<div class="reply_info">
									<div class="user_info">
										<div class="info_frame">
											<div class="zzz">${board.userId }</div>
											<div class="zzz">${board.createdDate }</div>
										</div>
									</div>
								</div>
								
								<div class="user_content">
									<p>${board.content }</p>
								</div>
								<div class="xxx tete">
									<button class="btn_height">수정</button>
									<button class="btn_height">목록</button>
								</div>
							</div>
						</c:otherwise>
					</c:choose>
					
					
				</c:forEach>
			 
			
				<textarea rows="5" cols="100"></textarea>
				<div class="reply_button">
					<button type="button">댓글 등록</button>
				</div>
			</div>
			
		</div>
		
		
	</div>
</div>


