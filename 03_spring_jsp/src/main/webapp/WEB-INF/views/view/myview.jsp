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
����� �̸��� ${lists}�Դϴ�
<div>
	<c:forEach var="mylist" items="${lists}">
		<div>${mylist}</div>
	</c:forEach>
</div>
</body>
</html>