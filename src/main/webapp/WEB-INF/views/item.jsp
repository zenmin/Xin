<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%
  String path = request.getContextPath();
%>    
    
    
<!DOCTYPE html>
<!-- saved from url=(0038)http://www.kp1314.com/qt/huanggua.html -->
<html lang="zh-cn"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
   <title>${item.name }-看片神器</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="generator" content="MyPHP">
<meta name="author" content="">
    <link type="text/css" rel="stylesheet" href="<%=path %>/Content/font-awesome.css">
    <link type="text/css" rel="stylesheet" href="<%=path %>/Content/style.css">
    <link type="text/css" rel="stylesheet" href="<%=path %>/Content/video-js.min.css">
    <script type="text/javascript" src="<%=path %>/Scripts/jquery.js"></script>
    <script type="text/javascript" src="<%=path %>/Scripts/main.js"></script>
    <script type="text/javascript">
    $(function(){
        
        $("#report_btn").click(function(){
            if(confirm("您确认此视频播放不了吗？如果您恶意举报系统将注销您的账户！")){
                return true;
            }else{
                return false;
            }
        });
        
    });
    </script>
    <style type="text/css">
<!--
.STYLE1 {color: #0000FF}
-->
    </style>
</head>
<body>
<div class="menua"></div>
   <div class="header">
        <span>${item.name }</span>
    </div>   
<div class="wp">
        <a href="javascript:window.history.back();" class="an_1">返回列表</a>
        <div class="box">
            <div class="nr">
                                 <div class="wp">
    <div class="box">
						<div class="nr">
						  <c:if test="${item.href2!=null&&item.href2!='' }">
							<form action=""
								id="vbp-login-form" method="post" name="form1"
								onsubmit="javascript:return loginyz()">
								<ul class="form">
									<li style="text-align: center"><a class="form_sub"
										href="${item.href2 }">点此进入${item.name }</a></li>
								</ul>
							</form>
							</c:if>
							 <c:if test="${item.href3!=null&&item.href3!='' }">
							<form action=""
								id="vbp-login-form" method="post" name="form1"
								onsubmit="javascript:return loginyz()">
								<ul class="form">
									<li style="text-align: center"><a class="form_sub"
										href="${item.href3 }">点此购买激活码</a></li>
								</ul>
							</form>
							</c:if>
							  <c:if test="${item.href4!=null&&item.href4!='' }">
							 <form action=""
                                id="vbp-login-form" method="post" name="form1"
                                onsubmit="javascript:return loginyz()">
                                <ul class="form">
                                    <li style="text-align: center"><a class="form_sub"
                                        href="${item.href4 }">${item.name }安卓手机下载</a></li>
                                </ul>
                            </form>
                            </c:if>
                            <c:if test="${item.href5!=null&&item.href5!='' }">
                            <form action=""
                                id="vbp-login-form" method="post" name="form1"
                                onsubmit="javascript:return loginyz()">
                                <ul class="form">
                                    <li style="text-align: center"><a class="form_sub"
                                       href="${item.href5 }">${item.name }苹果手机下载</a></li>
                                </ul>
                            </form>
							</c:if>
							
							
							<br>
							<div style="text-align: center;">
								<span style="font-size: 20px;"><b><span
										style="color: #ff0000;"><span
											style="background-color: #fff0f5;">${item.remake }</span></span></b><strong><span
										style="font-size: 16px;"><span style="color: #ff0000;"><span
												style="background-color: #ffff00;">${item.content }</span><br><br>
												
								&nbsp;
							</div>
						</div>
					</div>
</div>
				<div style="text-align: center">
					<span style="font-size: 20px;"><strong><span
							style="color: #ff0000">${item.footer }</span></strong></span>
				</div>
				<div style="text-align: center">
					<br> <strong><span
						style="font-size: 16px; color: rgb(0, 0, 255);">
						<span id="imgurl" style="display: none;">${item.img }</span>
						<div id="showimg" style="background-color: #ffffff">
						       
						</div>
                    </strong>
				</div>
				<link href="<%=path %>/Content/font-awesome.css" rel="stylesheet" type="text/css">
				<link href="<%=path %>/Content/style.css" rel="stylesheet" type="text/css">
				<div class="box">
					<div class="box">
						<div class="bt"></div>
					</div>
				</div>

			</div></div></div></body></html>