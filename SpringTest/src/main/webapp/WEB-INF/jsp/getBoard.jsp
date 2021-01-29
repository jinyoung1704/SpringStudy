<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.dto.Board"%>
<html>
<head>
    <title>게시판 상세페이지</title>
    <style>
        #wrap{
            width:530px;
            margin-left:auto; 
            margin-right:auto;
            text-align:center;
        }
        
        table{
            margin-left:auto; 
            margin-right:auto;
            border:3px solid skyblue
        }
        
        td{
            border:1px solid skyblue
        }
        
        #tdtitle{
            background-color:skyblue
        }
    </style>
</head>
<%
	Board board = (Board)request.getAttribute("board");
%>

<body>
    <!-- div 왼쪽, 오른쪽 바깥여백을 auto로 주면 중앙정렬된다.  -->
    <div id="wrap">
        <br><br>
        <b><font size="6" color="gray">게시판 글쓰기</font></b>
        <br><br>
        
        <form method="post" id="postForm" action="/postSubmit">
            <table>
           		 <tr>
                    <td id="tdtitle">번호</td>
                    <td>
                        <%=board.getBoardnum() %>
                    </td>
                </tr>
                
                <tr>
                    <td id="tdtitle">이름</td>
                    <td>
                        <%=board.getName() %>
                    </td>
                </tr>
                        
                
                <tr>
                    <td id="tdtitle">제목</td>
                    <td>
                        <%=board.getTitle() %>
                    </td>
                </tr>
                    
                <tr>
                    <td id="tdtitle">날짜</td>
                    <td>
                       <fmt:formatDate value="<%=board.getWriteday() %>" pattern="yyyy-MM-dd"/>
                    </td>
                </tr>
                
                <tr>
                    <td id="tdtitle">조회수</td>
                    <td>
                      <%=board.getReadcount() %>
                    </td>
                </tr>
                
                <tr>
                    <td id="tdtitle">내용</td>
                    <td>
                       <%=board.getContent() %>
                    </td>
                </tr>
                    
                <tr>
      
                    <td>
                        <input type="submit" value="글쓰기"/>  <input type="button" value="취소">
                    </td>
              	</tr>
            </table>
       
          
        </form>
    </div>
</body>
</html>


