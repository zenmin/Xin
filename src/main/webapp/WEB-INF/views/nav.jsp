<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
  String path = request.getContextPath();
%>
<link rel="Shortcut Icon" href=/favicon.ico>
<nav class="navbar navbar-default navbar-fixed-top" style="height: 60px;">
            <div class="brand" style="height: 60px;">
                <a href="index"><font size="5" style="line-height:0px;">Xin平台</font></a>
            </div>
            <div class="container-fluid">
                <div class="navbar-btn" >
                    <button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
                </div>
<!--                 <form class="navbar-form navbar-left"> -->
<!--                     <div class="input-group"> -->
<!--                         <input type="text" value="" class="form-control" placeholder="Search dashboard..."> -->
<!--                         <span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span> -->
<!--                     </div> -->
<!--                 </form> -->
              
                <div id="navbar-menu">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="assets/img/user.png" class="img-circle" alt="Avatar"> 
                            <span>
                        <c:out value="${sessionScope.username}" escapeXml="false">
                        <script>
                            alert('你还未登陆,或登陆已经超时！\n请你重新登陆哦！');
                            window.location.href = "${pageContext.request.contextPath}/tologin";
                        </script>
                        </c:out> 
                            </span> 
                            <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="${pageContext.request.contextPath}/logout"><i class="lnr lnr-user"></i> <span>退出</span></a></li>
<!--                                 <li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li> -->
<!--                                 <li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li> -->
<!--                                 <li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li> -->
                            </ul>
                        </li>
                        <!-- <li>
                            <a class="update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
                        </li> -->
                    </ul>
                </div>
            </div>
        </nav>
        <!-- END NAVBAR -->
        <!-- LEFT SIDEBAR -->
        <div id="sidebar-nav" class="sidebar">
            <div class="sidebar-scroll">
                <nav>
                    <ul class="nav">
                        <li><a href="<%=path %>/rx" class=""><i class="lnr lnr-home"></i> <span>首页预览</span></a></li>
                        <li><a href="<%=path %>/category" class=""><i class="lnr lnr-dice"></i> <span>分类预览</span></a></li>
<!--                         <li><a href="elements.html" class=""><i class="lnr lnr-code"></i> <span>分类预览</span></a></li> -->
                        <li><a href="<%=path %>/sp" class=""><i class="lnr lnr-chart-bars"></i> <span>视频预览</span></a></li>
                        <li><a href="<%=path %>/webmsg" class=""><i class="lnr lnr-cog"></i> <span>网站信息</span></a></li>
                        <li><a href="<%=path %>/to/version" class=""><i class="lnr lnr-alarm"></i> <span>系统信息</span></a></li>
                        <!-- li>
                            <a href="#subPages" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>Pages</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                            <div id="subPages" class="collapse ">
                                <ul class="nav">
                                    <li><a href="page-profile.html" class="">Profile</a></li>
                                    <li><a href="page-login.html" class="">Login</a></li>
                                    <li><a href="page-lockscreen.html" class="">Lockscreen</a></li>
                                </ul>
                            </div>
                        </li-->
                        <li><a href="about" class=""><i class="lnr lnr-text-format"></i> <span>关于我们</span></a></li>
<!--                         <li><a href="icons.html" class=""><i class="lnr lnr-linearicons"></i> <span>Icons</span></a></li> -->
                    </ul>
                </nav>
            </div>
        </div>