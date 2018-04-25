<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>后台管理中心</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- bstable \表格-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dmjs/common/bootstrap-3.3.7-dist/css/bootstrap.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dmjs/common/bstable/bootstrap-table.min.css">
  <!-- bstable-->
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/admincenter/adminlte/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/admincenter/adminlte/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/admincenter/adminlte/AdminLTE.min.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/dmcss/admincenter/adminlte/skin-blue.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/dmcss/admincenter/adminlte/special.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="${pageContext.request.contextPath}/public/index" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>D</b>M</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Duo</b>Miao</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
          <li class="dropdown messages-menu">
            <!-- Menu toggle button -->
            <!-- <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success">4</span>
            </a> -->
            <ul class="dropdown-menu">
              <li>
                <!-- inner menu: contains the messages -->
                <ul class="menu">
                  <li><!-- start message -->
                    <a href="#">
                      <div class="pull-left">
                        <!-- User Image -->
                        <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                      </div>
                      <!-- Message title and timestamp -->
                      <h4>
                        Support Team
                        <small><i class="fa fa-clock-o"></i> 5 mins</small>
                      </h4>
                      <!-- The message -->
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <!-- end message -->
                </ul>
                <!-- /.menu -->
              </li>
              <li class="footer"><a href="#">See All Messages</a></li>
            </ul>
          </li>
          <!-- /.messages-menu -->

          <!-- Notifications Menu -->
          <li class="dropdown notifications-menu">
            <!-- Menu toggle button -->
          <!--   <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a> -->
            <ul class="dropdown-menu">
          <!--     <li class="header">You have 10 notifications</li> -->
              <li>
                <!-- Inner Menu: contains the notifications -->
                <ul class="menu">
                  <li><!-- start notification -->
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5 new members joined today
                    </a>
                  </li>
                  <!-- end notification -->
                </ul>
              </li>
              <li class="footer"><a href="#">View all</a></li>
            </ul>
          </li>
          <!-- Tasks Menu -->
          <li class="dropdown tasks-menu">
            <!-- Menu Toggle Button -->
         <!--    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">9</span>
            </a> -->
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li>
                <!-- Inner menu: contains the tasks -->
                <ul class="menu">
                  <li><!-- Task item -->
                    <a href="#">
                      <!-- Task title and progress text -->
                      <h3>
                        Design some buttons
                        <small class="pull-right">20%</small>
                      </h3>
                      <!-- The progress bar -->
                      <div class="progress xs">
                        <!-- Change the css width attribute to simulate progress -->
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer">
                <a href="#">View all tasks</a>
              </li>
            </ul>
          </li>
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
            <%--  <img src="${pageContext.request.contextPath}${SESSION_admin_INFO.imgUrl}" class="user-image" alt="User Image">--%>
              <span class="hidden-xs">${sessionScope.SESSION_admin_INFO.adminName}</span>
            </a>
          </li>
          <li>
          <!-- 退出 -->
            <a href="${pageContext.request.contextPath}/admin/doLoginOut" ><i class="fa fa-gears">退出</i></a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
     <!--  <div class="user-panel">
        <div class="pull-left image">
          <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Alexander Pierce</p>
          Status
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div> -->

      <!--search form (Optional) -->
  <%-- <form action="#" method="get" class="sidebar-form">
       <div class="input-group">
           <input type="text" name="q" class="form-control" placeholder="Search...">
          <span class="input-group-btn">
              <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
              </button>
            </span>
        </div>
      </form> --%>
      <!-- /.search form -->

      <!-- Sidebar Menu 右侧导航栏-->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">管理中心</li>
        <!-- Optionally, you can add icons to the links -->
        <li><a href="${pageContext.request.contextPath}/admin/adminlte/enBasicInfo"><i class="fa fa-link">></i> <span>基本信息</span></a></li>
        <li><a href="${pageContext.request.contextPath}/admin/adminlte/enManageEnt"><i class="fa fa-link">></i> <span>企业信息管理</span></a></li>
        <li class="active"><a href="${pageContext.request.contextPath}/admin/adminlte/enManageHr"><i class="fa fa-link">></i> <span>HR用户管理</span></a></li>
        <li><a href="${pageContext.request.contextPath}/admin/adminlte/enManageIntern"><i class="fa fa-link">></i> <span>实习生用户管理</span></a></li>
        <li><a href="${pageContext.request.contextPath}/admin/adminlte/enManageAdmin"><i class="fa fa-link">></i> <span>管理员信息管理</span></a></li>
        <li><a href="${pageContext.request.contextPath}/admin/adminlte/enManageCategory"><i class="fa fa-link">></i> <span>职位类别管理</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- 主体内容-->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
       <h1>
         Personal Center
        <small>Optional description</small>
      </h1> 
      <ol class="breadcrumb">
        <li><a href="${pageContext.request.contextPath}/admin/adminlte/enIndex"> <i class="fa fa-dashboard"></i>管理中心</a></li>
        <li class="active">HR用户管理</li>
      </ol>
    </section>

    <!-- Main content width:1170px-->
    <section class="content container-fluid">
<div class="main-body" style="margin-top: -10px">
<!--主体内容-->
<table id="hrList">
</table>
</div>


    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
      Anything you want
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2018 <a href="#">DuoMiao</a>.</strong> All rights reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane active" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:;">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:;">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="pull-right-container">
                    <span class="label label-danger pull-right">70%</span>
                  </span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->
      <!-- Stats tab content -->
      <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">General Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Report panel usage
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Some information about this general settings option
            </p>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <div class="control-sidebar-bg"></div>
</div>
<jsp:include page="../../public_page/public_js.jsp" />
<script src="${pageContext.request.contextPath}/dmjs/common/bstable/jquery-3.0.0.js"></script>
<script src="${pageContext.request.contextPath}/dmjs/common/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/dmjs/common/bstable/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/dmjs/common/bstable/bootstrap-table-zh-CN.min.js"></script>
<script src="${pageContext.request.contextPath}/dmjs/admincenter/adminlte/adminlte.min.js"></script>
<script src="${pageContext.request.contextPath}/dmjs/admincenter/adminlte/managehr.js"></script>
</body>
</html>