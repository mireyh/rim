<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div id="test">
	<h3></h3>
</div>
<%--  <h1>${name }</h1> --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function(){
		$.ajax({
			url: "/ajax.do",	//호출할 주소
			data: {name: "ahhhh"},	//넘길 데이터
			dataType: "json",	//데이터 타입 json으로 설정 (안하면 밑에 처럼 JSON.parse를 해야함)
			success: function(data) {	//결과 받기
				//data = JSON.parse(data);	//JSON 형태로 파싱
				console.log(data);
			}
		})
	});
</script>
</body>
</html>