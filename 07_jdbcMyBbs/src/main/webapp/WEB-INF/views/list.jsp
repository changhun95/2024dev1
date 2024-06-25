<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
</head>
<body>
	<h2>집가고싶어</h2>
	<c:forEach var="dto" items="${lists}">
		<div>${dto.id} / ${dto.writer} / <a href="/view?id=${dto.id}">${dto.title}</a> / ${dto.content} / <a href="/delete?id=${dto.id}">삭제</a> </div>
	</c:forEach>
	<a href="/writerForm">글쓰기</a>
</body>
</html>
