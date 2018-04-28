<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/common/common.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/interncenter/login_register.css" />
</head>
<body bgcolor="#f8f8f8">
<center>
<div class="lr-box">
<div class="lr-box-header">
<h1 class="main-title">朵喵</h1>
<h2 class="sub-title">后台管理 - Manage Easy</h2>
</div>
<div class="lr-box-choice">
<a href="javascript:;" class="l-button after">登录</a>
</div>
<div class="clearfix"></div>
<div class="lr-box-main-l">
<form id="form_l">
 <div><input type="text" placeholder="请输入用户名" name="adminName" id="loginName"/></div>
<div><input type="password" placeholder="请输入密码" name="adminPwd" id="loginPwd"/></div>
<div class="btn"><input type="button" class="btn_lr" value="登录" id="btn_l"/></div>
</form>
</div>
</div>
</center>
<jsp:include page="../public_page/public_js.jsp" />
<script type="text/javascript" src="${pageContext.request.contextPath}/dmjs/admincenter/login_register.js" ></script>
</body>
</html>