<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="loginCheck">

	id : <input type="text" name="ename" value="ALLEN"><br>
	password : <input type="text" name="empno" value="7499"><br>
	<button type="submit">로그인</button><br>

	<c:if test="${param.msg eq '1' }">
		<span style="color:red">
			아이디 또는 패스워드를 확인해 주세욧
		</span>
	</c:if>
</form>


</body>
</html>