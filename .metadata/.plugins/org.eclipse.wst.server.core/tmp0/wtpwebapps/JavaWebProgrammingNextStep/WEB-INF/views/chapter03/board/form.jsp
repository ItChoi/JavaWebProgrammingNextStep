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

.board_content, .board_reply_frame {
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
	margin: 0px 50px;
}

.user_content {
	margin-bottom: 50px;
}

.reply_count {
	text-align: left;
}

.reply_content {
	text-align: center;
}

.board_reply_frame {
	height: 100%;
	overflow: scroll;
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
				2개의 의견
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
					</div>
				</div>
				
				<div class="user_content">
					<p>${board.content }</p>
					<div class="xxx">
						<button>수정</button>
						<button>삭제</button>
					</div>
				</div>
			</c:forEach>
			
			
			
			<div class="reply_content">
				<textarea rows="5" cols="100"></textarea>
			</div>
			
		</div>
		
	</div>
</div>


