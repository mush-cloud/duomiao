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
<link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/index.css" />
	</head>
	<body bgcolor="#f8f8f8"> 
		<jsp:include page="public_page/header.jsp" />
	   <div class="index">
	     <div class="intern-type">
	   	  	<!--4+10-->
	   	  	<div class="type-head"><span class="typefont">全部分类</span><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/type.png" class="typepic"/></div>
                 <c:if test="${rows>0}">
				 <c:forEach    begin="0" end="${rows-1}" varStatus="st1">
					 <div class="type-item" data-type="" id="type-item">
						 <c:forEach items="${requestScope.allPosCate}" begin="${4*(st1.index)}" end="${4*(st1.index)+3}" var="cateList" varStatus="st2">
							 <c:forEach items="${cateList}" end="0" var="cate">
						 <a href="${pageContext.request.contextPath}${cate.url}?id=${cate.id}" target="_blank" class="one-level">${cate.typeName}</a>
							 </c:forEach>
						<%-- <a href="" target="_blank" class="one-level">软件</a>
						 <a href="" target="_blank" class="one-level">运营</a>
						 <a href="" target="_blank" class="one-level">硬件</a>--%>
						 </c:forEach>
						 <div class="type-list" id="type-list">
					 <c:forEach items="${requestScope.allPosCate}" begin="${4*(st1.index)}" end="${4*(st1.index)+3}" var="cateList" varStatus="st2">
						 <div>
							 <c:forEach items="${cateList}"  var="cate" varStatus="st3">
								 <c:if test="${st3.index eq 0}"><a href="${pageContext.request.contextPath}${cate.url}?id=${cate.id}" target="_blank" class="one-level">${cate.typeName}</a></c:if>
								 <c:if test="${st3.index != 0}"><a href="${pageContext.request.contextPath}${cate.url}?childId=${cate.id}" target="_blank">${cate.typeName}</a></c:if>
							 </c:forEach>
							 </div>
					 </c:forEach>
						 </div>
					 </div>
				 </c:forEach></c:if>
	     </div>
	    <div class="banner" >
	     <div class="ban_top">
	     	<div class="search">
	     		<form name="searchform" method="post" action="${pageContext.request.contextPath}/public/mainSearch">
		<input class="inp_srh" name="jobName" id="jobName"  placeholder="请输入职位名称" >
		<input class="btn_srh" type="submit" value="搜索">
	</form>
	     	</div>
	     	<div class="heat_word"><span>热门搜索:</span><a>项目经理</a><a>广告</a><a>财会</a><a>前端</a></div>
	     </div>
	     <!--职位策划专题，特殊类展示-->
	     <div class="ban_body">
	        <img src="${pageContext.request.contextPath}/imgs/index_header_bottom/ban_1.jpg" style="display:none"/> 
	     	<img src="${pageContext.request.contextPath}/imgs/index_header_bottom/ban_2.jpg" style="display:none"/> 
	     	<img src="${pageContext.request.contextPath}/imgs/index_header_bottom/ban_3.jpg" style="display:none"/> 
	     	<img src="${pageContext.request.contextPath}/imgs/index_header_bottom/ban_4.jpg" style="display:none"/> 
	     	<img src="${pageContext.request.contextPath}/imgs/index_header_bottom/ban_5.jpg" style="display:none"/> 
	     	<a href="#"><div class="showcase"></div></a>
	     	<div class="content"><span id="1">寒假实习专场</span><span id="2">网易实习招募</span><span id="3">多喵喵专场</span><span id="4">hk百度</span><span id="5">天池大数据</span></div>
	     </div>
	    </div>
	    <!--企业付钱在首页展示/静态展示-->
	    <div class="company-show">
	    	<div class="company-list">
	    		<div>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_8.jpg"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_1.png"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_2.png"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_3.jpg"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_4.jpg"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_5.jpg"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_6.jpg"/></a>
	    		<a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/cp_7.jpg"/></a>
	    		</div>
	    	</div>
	        <div class="job">
	    	  <div class="job-choose">
	    	  	<div class="choose c1" id="hot-job">热门职位</div>
	    	  	<div class="choose c2" id="new-job">最新职位</div>
	    	  	<div class="choose c3"><a href="${pageContext.request.contextPath}/public/mainSearch">查看更多职位 &gt;</a></div>
	    	  </div>
	    	  <div class="job-list">
	    	  	<!--默认显示部分-->
	    	  	<div class="left" id="hot">
					<c:forEach items="${requestScope.hotJobs}" var="hotJob">
	    	  		<div class="item" id="item">

						<div class="info">
	    	  				<div class="job_name"><a href="" target="_blank">${hotJob.jobName}</a><span>[${hotJob.workPlace}]</span></div>
	    	  		        <div class="salary_btn">
	    	  		        	<span class="salary">${hotJob.minSalary}-${hotJob.maxSalary}￥/月</span>
	    	  		        	<a  class="sendResume" entid="${hotJob.entId}" data="${hotJob.id}">立即投递</a>
	    	  		        </div>
	    	  			</div>
	    	  			<div class="conpany">
	    	  				<img class="con_tx" src="${pageContext.request.contextPath}${hotJob.enterpriseInfo.imgUrl}"/>
	    	  				<div class="wrap">
	    	  					<a href="" class="con_name" target="_blank">${hotJob.enterpriseInfo.eniname}</a>
	    	  					<span class="major">[${hotJob.enterpriseInfo.industry}]</span>
	    	  					<p class="con_indu">${hotJob.enterpriseInfo.resume}</p>
	    	  				</div>
	    	  			</div>
	    	  			<%--<div class="info">
	    	  				<div class="job_name"><a href="" target="_blank">游戏评测师</a><span>[广州]</span></div>
	    	  		        <div class="salary_btn">
	    	  		        	<span class="salary">2000-4000元/月</span>
	    	  		        	<a href="">立即投递</a>
	    	  		        </div>
	    	  			</div>
	    	  			<div class="conpany">
	    	  				<img class="con_tx" src="${pageContext.request.contextPath}/imgs/index_header_bottom/wangyi.jpg"/>
	    	  				<div class="wrap">
	    	  					<a href="" class="con_name" target="_blank">网易(杭州)网络有限公司</a>
	    	  					<span class="major">[网络游戏]</span>
	    	  					<p class="con_indu">游戏热爱者</p>
	    	  				</div>
	    	  			</div>--%>
	    	  		</div></c:forEach>
	    	  	</div>
	    	  	
	    	  		
	    	  	<!--隐藏的部分-->
	    	  	<div class="right" id="newly">
       <c:forEach items="${requestScope.newJobs}" var="newJob">
	    	  				<div class="item">
	    	  			<div class="info">	    					
	    	  				<div class="job_name"><a href="" target="_blank">${newJob.jobName} </a><span>[${newJob.workPlace}]</span></div>
	    	  		        <div class="salary_btn">
	    	  		        	<span class="salary">${newJob.minSalary}-${newJob.maxSalary}￥/月</span>
	    	  		        	<a class="sendResume" entId="${newJob.entId}" data="${newJob.id}">立即投递</a>
	    	  		        </div>
	    	  			</div>
	    	  			<div class="conpany">
	    	  				<img class="con_tx" src="${pageContext.request.contextPath}${newJob.enterpriseInfo.imgUrl}"/>
	    	  				<div class="wrap">
	    	  					<a href="" class="con_name" target="_blank">${newJob.enterpriseInfo.eniname}</a>
	    	  					<span class="major">[${newJob.enterpriseInfo.industry}]</span>
	    	  					<p class="con_indu">${newJob.enterpriseInfo.resume}</p>
	    	  				</div>
	    	  			</div>
	    	  	</div>
	   </c:forEach>
	    	  	</div>
	    	  </div>
	        </div>
	    </div>
	   </div>
	   	   <jsp:include page="public_page/bottom.jsp" />
	   	   	      <jsp:include page="public_page/public_js.jsp" />
	   <script type="text/javascript" src="${pageContext.request.contextPath}/dmjs/index.js" ></script>
	   	   </body>
	   	   </html>
	

