<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.dto.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>

<style>
   table {
    width: 100%;
    border: 1px solid #444444;
    border-collapse: collapse;
    width: 400px;
    
    margin-left: auto;
    margin-right: auto;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
</style>
</head>


<body>
<h2><center>게시판 리스트</center></h2>
 <table border="1">
 			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
			
			<tr>
				<th>1</th>
				<th>11</th>
				<th>111</th>
				<th>1111</th>
				<th>11111</th>
			</tr>
			
			<tr>
				<th>2</th>
				<th>22</th>
				<th>222</th>
				<th>2222</th>
				<th>22222</th>
			</tr>
			
			
	<%-- <%
	if(member != null ) {
		
	%>
			
		<tr>
		    <td><%=member.getId()%></td>
		    <td><%=member.getName()%></td>
		    <td><%=member.getNickname()%></td>
		    <td><%=member.getAge()%></td>
		    <td><%=member.getHobby()%></td>
		</tr>
		
	
	<%
	}
	%> --%>
	<br>
	<input type="submit" value="글쓰기"/> 
	</table>
</body>
</html>