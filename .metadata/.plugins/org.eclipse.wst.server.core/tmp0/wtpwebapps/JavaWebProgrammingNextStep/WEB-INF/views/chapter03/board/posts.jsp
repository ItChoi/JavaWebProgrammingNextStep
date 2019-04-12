<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
	<c:choose>
		<c:when test="${not empty boardList}">
		</c:when>
		<c:otherwise>
		<div>
			<div>게시글이 하나도 없습니다.</div>
		</div>
		</c:otherwise>
	</c:choose>
</div>
