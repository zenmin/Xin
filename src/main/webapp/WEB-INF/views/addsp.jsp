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
				<h3 class="page-title">添加视频</h3>
				<div class="container-fluid col-md-6">
					<div class="panel">
						<div class="panel-heading">
							<h3 class="panel-title">提交视频</h3>
						</div>
						<div class="panel-body">
						<form action="<%=path %>/addSp" method="post">
							<br>
							<div class="input-group">
								<span class="input-group-btn">
									<button class="btn btn-primary" type="button">名称</button>
								</span> <input class="form-control" name="name" value="" type="text">
							</div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">分类</button>
                                    <select class="form-control" style="float: right;width: 91%;"
                                             name="parentid" value="">
                                        <c:forEach items="${parent }" var="p">
                                        <option value="${p.id }">${p.name }</option>
                                        </c:forEach>
                                    </select>
                                </span> 
                            </div>
                            <br>
                             <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">内容主体</button>
                                </span> <input class="form-control" name="content" value=""  type="text">
                                <span class="input-group-addon">换行请加<c:out value="<br>"></c:out></span>
                            </div>
                            <br>
                             <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">内容描述</button>
                                </span> <input class="form-control" name="remake" value=""  type="text">
                            </div>
                            <br>                            
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">点击进入地址</button>
                                </span> <input class="form-control" name="href2" value=""  type="text">
                                 <span class="input-group-addon">请加上http://</span>
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">购买地址</button>
                                </span> <input class="form-control" name="href3" value=""  type="text">
                                 <span class="input-group-addon">请加上http://</span>
                            </div>
                            <br>
                             <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">图片描述</button>
                                </span> <input class="form-control" name="footer" value=""  type="text">
                            </div> 
                            <br>
                            <div class="input-group">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">图片地址</button>
                                </span> <input class="form-control" name="img" value=""  type="text">
                                  <span class="input-group-addon">可以添加网络图片，以","分隔</span>
                            </div> 
<!--                               <br> -->
<!--                             <div class="input-group"> -->
<!--                                 <span class="input-group-btn"> -->
<!--                                     <button class="btn btn-primary" type="button">图片上传</button> -->
<!--                                 </span>  <input class="form-control" type="file" value="选择头像上传"> -->
<!--                             </div> -->
                            
                            <br>
                              <div class="input-group" style="margin: auto;">
                                 <button type="submit" class="btn btn-success">保存</button>&nbsp;
                                 <button type="reset" class="btn btn-danger">重置</button>
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
	<script src="<%=path %>/assets/vendor/jquery/jquery.min.js"></script>
	<script src="<%=path %>/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="<%=path %>/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="<%=path %>/assets/scripts/klorofil-common.js"></script>
</body>

</html>
