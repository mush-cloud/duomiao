<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<div class="header">
			<div class="container">
				<a href="${pageContext.request.contextPath}/public/index"><div class="nav-logo"><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/logo.png"/></div></a>
				<div class="nav-menu">
					<a href="http://www.baidu.com">首页</a>
					<a href="http://www.baidu.com">实习</a>
					<a href="http://www.baidu.com">校招</a>
					<a href="http://www.baidu.com">朵喵学院</a>
					<a href="http://www.baidu.com">友情链接</a>
				</div>
				<div class="nav-user">
					<c:if test="${sessionScope.SESSION_INTERN_INFO == null}">
					<c:if  test="${sessionScope.SESSION_HR_INFO == null}">
					<!--未登录时状态-->
					<a href="${pageContext.request.contextPath}/intern/enLoginAndRegister" class="entry">个人入口</a>
					<a href="${pageContext.request.contextPath}/hr/enLoginAndRegister" class="entry">企业入口</a>
					</c:if>
					</c:if>
				<c:if test="${!empty sessionScope.SESSION_INTERN_INFO}">
				<!--实习生登录  -->
			   <div class="stu">
						<div class="stu-pic"><img class="txpic" src="${pageContext.request.contextPath}${SESSION_INTERN_INFO.imgUrl}"/></div>
						<div class="stu-body" id="stu-body"><dl class="stu-info">
							<dt><a href="${pageContext.request.contextPath}/intern/adminlte/enIndex">个人中心</a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/jiantou.png" class="jiantou" id="jiantou"/></dt>
							 <dd id="stu-dd">
                                <a href="${pageContext.request.contextPath}/intern/adminlte/enBasicInfo">基本信息</a>
                                <a href="http://www.ciweishixi.com/company_job/listJob">简历管理</a>
                                <a href="http://www.ciweishixi.com/company_resume/manager">我的收藏</a>
                               <%-- <a href="http://www.ciweishixi.com/logout">我的猫侍</a>
                                <a href="http://www.ciweishixi.com/logout">我的课程</a>--%>
                                <a href="${pageContext.request.contextPath}/intern/doLoginOut">退出</a>
                        </dd>
						</dl>
						</div>
					</div> 
					</c:if>
					<c:if test="${!empty sessionScope.SESSION_HR_INFO}">
					<!--企业登录  -->
				    <div class="stu">
						<div class="stu-pic"><img class="txpic" src="${pageContext.request.contextPath}${SESSION_HR_INFO.imgUrl}"/></div>
						<div class="stu-body" id="stu-body"><dl class="stu-info">
							<dt><a href="${pageContext.request.contextPath}/hr/adminlte/enIndex">HR中心</a><img src="${pageContext.request.contextPath}/imgs/index_header_bottom/jiantou.png" class="jiantou" id="jiantou"/></dt>
							 <dd id="stu-dd">
                                <a href="${pageContext.request.contextPath}/hr/adminlte/enBasicInfo">基本信息</a>
                                <a href="${pageContext.request.contextPath}/hr/adminlte/enPublishJob">发布职位</a>
                                <a href="${pageContext.request.contextPath}/hr/adminlte/enManagePublishJob">职位管理</a>
                                <a href="${pageContext.request.contextPath}/hr/adminlte/enResumeInfo">简历管理</a>
                                <a href="${pageContext.request.contextPath}/hr/doLoginOut">退出</a>
                        </dd>
						</dl>
						</div>
					</div>
				</c:if>
				</div>
			</div>
		</div>