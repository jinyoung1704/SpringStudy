<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.dto.Board"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>

<style>
	#wrap{
            width:530px;
            margin-left:auto; 
            margin-right:auto;
            text-align:center;
   }
   table {
    width: 100%;
    border: 1px solid #444444;
    border-collapse: collapse;
    width: 600px;
    
    margin-left: auto;
    margin-right: auto;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
  #title{
            background-color:skyblue
        }
</style>
</head>
<script type="text/javascript">
	
	function postForm() {
		alert("test");
		location.href ="/PostForm";
		
	}

</script>

<%
	List<Board> list = (List<Board>)request.getAttribute("boardList");
%>
<body>
     <div id="wrap">
        <br><br>
        <b><font size="5" color="gray">게시물 목록</font></b>
     	<br><br>
        <table>
            <tr>
                <th id="title">번호</th>
                <th id="title">제목</th>
                <th id="title">이름</th>
                <th id="title">날짜</th>
                <th id="title">조회수</th>                
            </tr>
            
        <!--     <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
            </tr>
            
            <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
            </tr>
            
             -->
            
 <%
	for(Board b: list) {
%>                        
            <tr> 
                <td><%=b.getBoardnum() %></td>
                <td><a href="/postdetail.action?getBoardnum=1"><%=b.getTitle() %></a></td>
                <td><%=b.getName() %></td>
                <td><fmt:formatDate value="<%=b.getWriteday() %>" pattern="yyyy-MM-dd"/></td>
                <td><%=b.getReadcount() %></td>
            </tr>
<%
	}    
 %>
    
 	</table>
        
        <br>
        <input type="button" value="글쓰기" onclick="postForm()"> 
    </div>
</body>
</html>
                
                
               
               
               
               
               