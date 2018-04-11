<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
	<title>Tables | Klorofil - Free Bootstrap Dashboard Template</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/vendor/linearicons/style.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="assets/css/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
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
				<h3 class="page-title">网站信息</h3>
				<div class="container-fluid col-md-6">
					<div class="panel">
						<div class="panel-heading">
							<h3 class="panel-title">网站信息设置</h3>
						</div>
						<div class="panel-body">
						<form action="saveMsg" method="post">
							<br>
							<div class="input-group">
							<input type="text" style="display: none;" name="id" value="${msg.id }">
								<span class="input-group-btn">
									<button class="btn btn-primary" type="button">网站公告</button>
								</span> <input class="form-control" name="webgg" value='<c:out value="${msg.webgg }"></c:out>' type="text">
							</div>
							<br>
						      <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">微信</button>
                                </span> <input class="form-control" name="wx" value="${msg.wx }"  type="text">
                            </div>
                            <br>
                             <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">QQ</button>
                                </span> <input class="form-control" name="qq" value="${msg.qq }"  type="text">
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">底部1</button>
                                </span> <input class="form-control" name="footer" value="${msg.footer }"  type="text">
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">底部2</button>
                                </span> <input class="form-control" name="footer2" value="${msg.footer2 }"  type="text">
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">顶部</button>
                                </span> <input class="form-control" name="top" value="${msg.top }"  type="text">
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">激活码地址</button>
                                </span> <input class="form-control" name="jhmhref" value="${msg.jhmhref }"  type="text">
                                <span class="input-group-addon">请加上http://</span>
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">顶部VIP名称</button>
                                </span> <input class="form-control" name="vip" value="${msg.vip }"   type="text">
                            </div>
                              <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">顶部VIP地址</button>
                                </span> <input class="form-control" name="viphref" value="${msg.viphref }"  type="text">
                                <span class="input-group-addon">请加上http://</span>
                            </div>
                             <br>
                              <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">备注</button>
                                </span> <input class="form-control" name="remake" value="${msg.remake }"  type="text">
                                <span class="input-group-addon">可为空</span>
                            </div>
                            <br>
                              <div class="input-group" style="margin: auto;">
                                 <button type="submit" class="btn btn-success">保存</button>&nbsp;
                                 <button type="button" class="btn btn-danger">重置</button>
                            </div>
                            <br>
                            </form>
						</div>
					</div>
				</div>
			</div>
			<!-- END BORDERED TABLE -->
		</div>


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
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
</body>

</html>
