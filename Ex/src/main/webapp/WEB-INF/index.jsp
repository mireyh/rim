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
			url: "/ajax.do",	//ȣ���� �ּ�
			data: {name: "ahhhh"},	//�ѱ� ������
			dataType: "json",	//������ Ÿ�� json���� ���� (���ϸ� �ؿ� ó�� JSON.parse�� �ؾ���)
			success: function(data) {	//��� �ޱ�
				//data = JSON.parse(data);	//JSON ���·� �Ľ�
				console.log(data);
			}
		})
	});
</script>
</body>
</html>