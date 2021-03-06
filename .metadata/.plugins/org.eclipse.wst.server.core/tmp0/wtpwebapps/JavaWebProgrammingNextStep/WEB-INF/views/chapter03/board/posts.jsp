<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
.posts_frame {
	width: 100%;
	height: 100%;
	text-align: center;
}

.posts_header {
	height: 10%;
	border-bottom: 1px solid black;
}

.posts_content {
	height: 80%;
	border-bottom: 1px solid black;
}

.posts_footer {
	height: 10%;
}

table {
	width: 100%;
	table-layout: fixed;
}

table

</style>

<div class="posts_frame">
	<div class="posts_header">
		헤더
	</div>

	<div class="posts_content">
		<table>
			<colgroup>
				<col width="50px;" /> <!-- 순서 -->
				<col width="250px;" /> <!-- 제목 -->
				<col width="100px;" /> <!-- 작성자 -->
				<col width="100px;" /> <!-- 조회수 -->
				<col width="100px;" /> <!-- 등록 날짜 -->
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>등록 날짜</th>
			</tr>
			
			<c:choose>
				<c:when test="${not empty boardList}">
					<c:forEach var="board" items="${boardList }">
						<tr>
							<td>${board.rnum }</td>
							<%-- <td><a href="detail?boardId=${board.boardId }">${board.title }</a></td> --%>
							<td><a href="javascript:menuChange('detail?boardId=${board.boardId }');">${board.title }</a></td>
							<td>${board.userId }</td>
							<td>${board.hitCount }</td>
							<td>${board.createdDate }</td>
						</tr>
					</c:forEach>
				
				</c:when>
				<c:otherwise>
					<div>게시글이 하나도 없습니다.</div>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
	<div class="posts_footer">
		푸터 페이징
	</div>
	
</div>


