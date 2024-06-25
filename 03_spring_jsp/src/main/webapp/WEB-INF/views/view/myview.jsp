<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
당신의 이름은 ${lists}입니다
<div>
	<c:forEach var="mylist" items="${lists}">
		<div>${mylist}</div>
	</c:forEach>
</div>
</body>
</html>