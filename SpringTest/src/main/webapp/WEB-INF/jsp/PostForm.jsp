<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<html>
<head>
    <title>게시판 글쓰기</title>
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


<body>
    <!-- div 왼쪽, 오른쪽 바깥여백을 auto로 주면 중앙정렬된다.  -->
    <div id="wrap">
        <br><br>
        <b><font size="6" color="gray">게시판 글쓰기</font></b>
        <br><br>
        
        <form method="post" id="postForm" action="/postSubmit">
            <table>
           		 <tr>
                    <td id="tdtitle">제목</td>
                    <td>
                        <input type="text" name="title" id="title" maxlength="15">
                    </td>
                </tr>
                
                <tr>
                    <td id="tdtitle">이름</td>
                    <td>
                        <input type="text" id="name" name="name" maxlength="20">
                    </td>
                </tr>
                        
                
                <tr>
                    <td id="tdtitle">비밀번호</td>
                    <td>
                        <input type="password" name="password" maxlength="15">
                    </td>
                </tr>
                    
                <tr>
                    <td id="tdtitle">내용</td>
                    <td>
                       <textarea class="" rows="10" name="content" id="content" cols="30" style="resize: none;"></textarea>
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


