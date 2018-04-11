<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
   String path = request.getContextPath();
%>
<!doctype html>
<html lang="en">

<head>
	<title>Tables | Klorofil - Free Bootstrap Dashboard Template</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="<%=path %>/assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=path %>/assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="<%=path %>/assets/vendor/linearicons/style.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="<%=path %>/assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="<%=path %>/assets/css/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="<%=path %>/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="<%=path %>/assets/img/favicon.png">
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
	<jsp:include page="nav.jsp"></jsp:include>
		<!-- NAVBAR -->
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <!--/.row-->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">关于程序</h1>
        </div>
    </div>
    <!--/.row-->
    <div class="form-group" style="width:600px;height: 400px;margin: auto;"
        align="center">
        <table class="zebra" style="border:1;border-color: gray;"
            align="center">
            <!-- 表头 -->
            <thead>
                <tr>
                    <th colspan=8>服务器信息</th>
                </tr>
            </thead>
            <!-- 账号信息 -->
            <tbody>
                
                <tr>
                    <td>服务器地址：${header.host }</td>
                </tr>
                <tr>
                    <td>服务器版本：<%= application.getServerInfo() %></td>
                </tr>

                <tr>
                    <td>服务器端口：<%=request.getServerPort() %></td>
                </tr>
                <tr>
                    <td>Session标识符：<%= session.getId() %></td>
                </tr>
                <tr>
                    <td>Session创建时间：<%= new Date(session.getCreationTime()).toString() %></td>
                </tr>
                <tr>
                    <td>Session超时时间：<%= session.getMaxInactiveInterval()%></td>
                </tr>
                 <% String  IP=request.getRemoteAddr(); %> 
                 <tr>
                    <td>客户端IP：<%=IP %></td>
                </tr>
                <tr>
                    <td>请求信息：${header["user-agent"] }</td>
                </tr>
                <tr>
                    <td>请求语言：${headerValues["Accept-Language"][0] }</td>
                </tr>

                <tr>
                    <td>当前项目：<%= application.getServletContextName() %></td>
                </tr>
            </tbody>
            <tr>
                <td>程序版本：V1.0</td>
            </tr>
            <tr>
            <td>开发人员：二哥</td>
            </tr>
            <tr>
            <td>BUG反馈：<a
                href="http://wpa.qq.com/msgrd?v=3&uin=741703967&site=qq&menu=yes" target="_blank">请点击此处</a></td>
            </tr>
        </table>
    </div>

</div>
<!--/.main-->


	</div>
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">&copy; 2017 <a href="#" target="_blank">Theme I Need</a>. All Rights Reserved. More SoftWare - Collect from 二哥</p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="<%=path %>/assets/vendor/jquery/jquery.min.js"></script>
	<script src="<%=path %>/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="<%=path %>/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="<%=path %>/assets/scripts/klorofil-common.js"></script>
</body>

</html>
