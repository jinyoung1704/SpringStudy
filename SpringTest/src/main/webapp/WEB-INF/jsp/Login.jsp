<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<html>
<head>
    <title>로그인</title>
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
        
        #title{
            background-color:skyblue
        }
    </style>
</head>

<body>
    <!-- div 왼쪽, 오른쪽 바깥여백을 auto로 주면 중앙정렬된다.  -->
    <div id="wrap">
        <br><br>
        <b><font size="6" color="gray">로그인</font></b>
        <br><br>
        
        <form method="post" id="LoginForm" action="/">
            <table>
                <tr>
                    <td id="title">아이디</td>
                    <td>
                        <input type="text" id="id" name="id" maxlength="20">
                        <input type="button">    
                    </td>
                </tr>
                        
                <tr>
                    <td id="title">비밀번호</td>
                    <td>
                        <input type="password" name="password" id="password" maxlength="15">
                    </td>
                </tr>
                
            </table>
            <br>
            <input type="submit" value="로그인"/>  <input type="submit" value="회원가입">
        </form>
    </div>
</body>
</html>


