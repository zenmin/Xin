<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  String path = request.getContextPath();
%> 
<!doctype html>
<html lang="en">

<head>
	<title>分类管理</title>
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
	<script type="text/javascript" src="Content/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$(".ubtn").click(function(){
			 $(this).parent().parent().find("div").eq(0).hide();
			 $(this).parent().parent().find("div").eq(1).show();
			 $(this).parent().parent().parent().find("td").eq(1).find("input").show();
			 $(this).parent().parent().parent().find("td").eq(2).find("input").show();
			 $(this).parent().parent().parent().find("td").find("span").hide();
             $(this).parent().parent().parent().find("td").find("span").hide();
		});
		
		$(".ucancel").click(function(){
            $(this).parent().parent().find("div").eq(0).show();
            $(this).parent().parent().find("div").eq(1).hide();
            $(this).parent().parent().parent().find("td").eq(1).find("input").hide();
            $(this).parent().parent().parent().find("td").eq(2).find("input").hide();
            $(this).parent().parent().parent().find("td").find("span").show();
            $(this).parent().parent().parent().find("td").find("span").show();
       })
       
       $("#addcate").click(function(){
    	   if($("#savecate").css("display")=="block"){
    		   $("#savecate").hide();
    	   }else{
    		   $("#savecate").show();
    	   }
       });
	});
	</script>
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
					<h3 class="page-title">分类管理</h3>
				        <div class="row">
                        <div class="col-md-12">
                            <!-- BORDERED TABLE -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <h3 class="panel-title">分类信息表</h3>
                                 
                                </div>
                                <div style="margin-left: 1%;">
                                      <button type="button" id="addcate" class="btn btn-primary">添加分类</button>
                                 </div>
                                  <div id="savecate" style="display: none;" class="panel-body col-md-6  col-md-offset-2" >
                                    <form action="insertparent" method="get">
                                                                    名称
                                       <input class="form-control col-md-1" name="name" value=""  /><br>
                                     
                                                                  备注
                                       <input class="form-control col-md-1"  name="remake" value="" />
                                       <br>
                                        <br><br>
                                       <input class="form-control btn btn-primary" type="submit" value="保存分类">
                                       </form>
                                  </div>
                                 
                                <div class="panel-body">
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th>I D</th>
                                                <th>类别名称</th>
                                                <th>备  注</th>
                                                <th>操  作</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${list }" var="l">
                                            <tr>
                                            <form action="savecate" method="get">
                                                <td>
                                                <span>${l.id }</span>
                                                    <input class="form-control" style="display: none;" name="id" value="${l.id }">
                                                </td>
                                                <td>
                                                 <span>${l.name }</span>
                                                    <input class="form-control" style="display: none;" name="name" value="${l.name }">
                                                </td>
                                                <td>
                                                 <span>${l.remake }</span>
                                                     <input class="form-control" style="display: none;" name="remake" value="${l.remake }">
                                                </td>
                                                <td>
												<div id="updatebtn">
                                                    <button type="button" class="btn btn-success ubtn">修改</button>&nbsp;
                                                    <a type="button" class="btn btn-danger" 
                                                    onclick="javascript:if(confirm('确定删除？'))window.location.href='<%=path %>/delparent?id=${l.id }'">删除</a>
                                                </div>
                                                    <div id="savebtn" style="display: none;">
                                                     <button type="submit" class="btn btn-primary usave">保存</button>&nbsp;
                                                    <button type="button" class="btn btn-warning ucancel">取消</button>
                                                    </div>
                                                </td>
                                                </form>
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
