<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>파일 하나</h3>
<form method="post" action="upload" enctype="multipart/form-data" accept-charset="utf-8">
	제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="content"><br>
	파일첨부 : <input type="file" name="file1"><br>
	
	<input type="submit" value="등록">
</form>

<hr>


<h3>파일 한번에 여러개</h3>
<form method="post" action="uploads" enctype="multipart/form-data" accept-charset="utf-8">
	제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="content"><br>
	파일첨부 : <input type="file" name="file1" multiple="multiple"><br>
	
	<input type="submit" value="등록">
</form>


<select multiple="multiple">
	<option>1</option>
	<option>12</option>
	<option>13</option>
	<option>14</option>
	<option>15</option>
</select>

</body>
</html>