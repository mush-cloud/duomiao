<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="public_page/public_css.jsp" />
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/mainsearch.css" />
	</head>
	<body bgcolor="#f8f8f8"> 
		<jsp:include page="public_page/header.jsp" />
	   <div class="index">
	    <div class="banner" >
	     <div class="ban_top">
	     	<div class="search">
	     		<form name="searchform" id="searchform">
		<input class="srh inp_srh" name="jobNameLike" id="jobName" placeholder="请输入职位名称" value="${requestScope.jobName}" type="text">
	<input type="text" name="maxSalary" id="maxSalary" hidden/>
		<input type="text" name="minSalary"  id="minSalary" hidden/>
		<input type="text" name="currentPage"  id="currentPage" value="1" hidden/>
		<input type="text" name="minEducationLev"  id="minEducationLev" hidden/>
					<c:if test="${!empty requestScope.pcId}">
					<input type="text" name="pcId"  id="pcId" value="${requestScope.pcId}" hidden/>
					</c:if>
					<c:forEach items="${requestScope.arrId}" var="arr" varStatus="st">
						<input type="text" name="arrId[${st.index}]"  value="${arr}" class="arrId" hidden/>
					</c:forEach>
					<input type="text" name="arrLength"  id="arrLength" value="0" hidden=""/>
					<%--<input type="text" name="arrId"  id="arrId" value="${requestScope.arrId}"/>--%>
		<input class="srh btn_srh" type="button" value="搜索">
	</form>
	     	</div>
	     	<%--<div class="heat_word"><span>热门搜索:</span><a href="#" target="_blank">项目经理</a><a href="#" target="_blank">广告</a><a href="#" target="_blank">财会</a><a href="#" target="_blank">前端</a></div>--%>
	     </div>
	     <!--职位策划专题，特殊类展示-->
	     <div class="ban_body">
			 <ul class="filter-list">
				 <li class="fix" data-type="s">
					 <span>月薪范围：</span>
					 <ul class="list-item s">
						 <li  class="active" data="{maxSalary:'',minSalary:''}">不限</li>
						 <li data="{maxSalary:'2000',minSalary:''}" id="s1">2000以下</li>
						 <li data="{maxSalary:'4000',minSalary:'2001'}" id="s2">2000-4000</li>
						 <li data="{maxSalary:'8000',minSalary:'40001'}" id="s3">4000-8000</li>
						 <li data="{maxSalary:'',minSalary:'8001'}" id="s4">8000以上</li>
					 </ul>
				 </li>
				 <li class="fix" data-type="x">
					 <span>最低学历：</span>
					 <ul class="list-item x">
						 <li class="active">不限</li>
						 <li id="x1" data="大专">大专</li>
						 <li id="x2" data="本科">本科</li>
						 <li id="x3" data="硕士">硕士</li>
						 <li id="x4" data="博士">博士</li>
					 </ul>
				 </li>
				 <li class="fix" data-type="l">
					 <span>职位类别：</span>
					 <ul class="list-item l">
						 <li class="" id="nolimit">不限</li>
					 </ul>
				 </li>
			<%--	 <li class="fix" data-type="ch">
					 <span>转正机会：</span>
					 <ul class="list-item">
						 <li>上海</li>
						 <li>本科</li>
						 <li>硕士</li>
						 <li>博士</li>
					 </ul>
				 </li>--%>
			 </ul>
	     </div>
	    </div>
	    <!--职位展示-->
	    <div class="company-show">
	        <div class="job">
	    	  <div class="job-choose">
	    	  	<div class="choose c1" id="result-job">职位列表</div>
	    	<%--  	<div class="choose c2" id="new-job">最新职位</div>
	    	  	<div class="choose c3"><a href="">查看更多职位 &gt;</a></div>--%>
	    	  </div>
	    	  <div class="job-list">

				  <div class="left" id="hot">
					  <!--工作显示-->
				  </div>
				  <div class="pages"></div>
	    	  	</div>
	    	  </div>
	        </div>
	    </div>
	   </div>
	   	   <jsp:include page="public_page/bottom.jsp" />
	   	   	      <jsp:include page="public_page/public_js.jsp" />
	   <script type="text/javascript" src="${pageContext.request.contextPath}/dmjs/mainsearch.js" ></script>
	   	   </body>
	   	   </html>
	

