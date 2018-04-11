<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<!-- NAVBAR -->
	<jsp:include page="nav.jsp"></jsp:include>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<h3 class="page-title">视频预览</h3>
				        <div class="row">
                        <div class="col-md-12">
                            <!-- BORDERED TABLE -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <h3 class="panel-title">视频预览</h3>
                                </div>
                                
                                 <div style="margin-left: 1%;">
                                      <a type="button" id="addsp" href="<%=path %>/addSpage" class="btn btn-primary">添加视频</a>
                                 </div>
                                
                                <div class="panel-body">
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th>I D</th>
                                                <th>名称</th>
                                                 <th>类别ID</th>
                                                <th>链 接</th>
                                                <th>激活码链接</th>
                                                <th>内 容</th>
                                                <th>是否上传图片</th>
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${list }" var="l">
                                            <tr>
                                                <td>${l.id }</td>
                                                <td>${l.name }</td>
                                                <td>${l.parentid }</td>
                                                <td>${l.href2 }</td>
                                                <td>${l.href3 }</td>
                                                 <td>${l.content }</td>
                                                 <td>${l.img==""?'否':'是' }</td>
                                                <td>
                                                <div>
                                                    <a href="xgsp/${l.id }" type="button" class="btn btn-success">修改</a>&nbsp;
                                                    <a type="button" class="btn btn-danger" 
                                                     onclick="javascript:if(confirm('确定删除？'))window.location.href='<%=path %>/delsp?id=${l.id }'">删除</a>
                                                </div>
                                                    <div style="display: none;">
                                                     <button type="button" class="btn btn-success">保存</button>&nbsp;
                                                    <button type="button" class="btn btn-danger">取消</button>
                                                    </div>
                                                </td>
                                            </tr>
                                         </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- END BORDERED TABLE -->
                        </div>
					</div>
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>
		
	<!--  弹窗     -->
		
		
	<!--  弹窗     -->	
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
