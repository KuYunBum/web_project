<%@page import="com.spring.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Human Health Gym</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet" href="/project/resources/css/include_template.css">
<link rel="stylesheet" href="/project/resources/css/template.css" />
<script src="/project/resources/js/include.js"></script>
<script>
	var result = '${msg}';
	if (result == 'success') {
		alert("처리가 완료되었습니다.");
	}
	if (result == 'overlap') {
		alert("중복되었습니다.");
	}
	if (result == 'fail1') {
		alert("로그인 실패! 다시 확인해주세요.");
	}
	if (result == 'fail2') {
		alert("입력안된 사항이 있습니다.");
	}
	if (result == 'login') {
		alert("로그인 되었습니다.");
	}
	if (result == 'logout') {
		alert("로그아웃 되었습니다.");
	}
</script>
</head>
<body>

	<div class="header">
        <div class="navbar1">

            <a href="/project/">
                <img src="/project/resources/image/logo.png" style="width:200px;height:150px;"> <!-- 로고 -->
            </a>

            <ul>
                <!-- 상단 메뉴 -->
	<%
		UserDTO dto = new UserDTO();
		String user = String.valueOf(session.getAttribute("user"));
		if(session.getAttribute("user")==null){
	%>	                
                <li><a href="/project/user/loginForm">로그인</a></li>
                <li><a href="/project/user/joinForm">회원가입</a></li>
    <%
		}else if(String.valueOf(session.getAttribute("userNum")).equals("1")){
		out.print(String.valueOf(session.getAttribute("user"))+" 님");
    %>
                <li><a href="/project/user/memberList">회원 관리</a></li>
                <li><a href="/project/user/logout">로그아웃</a></li>
    <%
		}else{
		out.print(String.valueOf(session.getAttribute("user"))+" 님");
    %>
                <li><a href="#">마이페이지</a></li>
                <li><a href="/project/user/logout">로그아웃</a></li>
    <%
		}
    %>            
                <li><a href="/project/content/help">고객센터</a></li>
            </ul>
        </div>

        <div class="navbar2">
            <ul>
                <!-- 메인 메뉴 -->
                <li><a href="/project/">홈</a></li>
                <li><a href="/project/content/ex_recomm/ex_recomm">AI 운동 추천</a></li>
                <li><a href="/project/content/membership">멤버쉽</a></li>
                <li><a href="/project/content/trainer">트레이너</a></li>
                <li><a href="/project/board/select">자유게시판</a></li>
                <li><a href="/project/content/gym">내 주변 헬스장 찾기</a></li>
                <li>
                    <div class="searchBox">
                        <!-- 수정해야함 -->
                        <div class="search">
                            <label>
                                <input type="text" name="searchBar " placeholder="검색어 입력">
                                <span class="material-symbols-outlined">search</span>
                            </label>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    
    </body>