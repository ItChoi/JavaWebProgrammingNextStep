<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<form:form modelAttribute="member">
	아이디: 
	<form:input path="userId" /> <br/>
	
	비밀번호
	<form:password path="password"/> <br/>
	
	이메일
	<form:input path="email"/> <br/>
	
	<button type="submit">등록</button>
</form:form>