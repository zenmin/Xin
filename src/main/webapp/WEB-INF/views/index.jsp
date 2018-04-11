<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<title>盒子</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="MyPHP" />
<meta name="author" content="" />
    <link type="text/css" rel="stylesheet" href="Content/font-awesome.css">
    <link type="text/css" rel="stylesheet" href="Content/style.css">
    <script type="text/javascript" src="Scripts/jquery.js"></script>
    <script type="text/javascript" src="Scripts/main.js"></script>
    <style type="text/css">
<!--
.STYLE1 {
	color: #FF00FF;
	font-weight: bold;
}
.STYLE2 {color: #0000FF}
-->
    </style>
    
</head>
<body>     
    <div class="menua"></div>
    <div class="header">
        <span>${webmsg.top }</span>
</div>    
<div class="wp">
        <a href="${webmsg.viphref }"class="an_1">${webmsg.vip }</a>
        <div class="box">
            <div class="bt">
			<div style="text-align:center">${webmsg.webgg }
			</div>
			</div>
            <div class="nr">
                <form method="post" name='form1'  id="vbp-login-form" onSubmit="javascript:return loginyz()" action="">
                      
                       <input type="hidden" name="fmdo" value="login">
                     <input type="hidden" name="dopost" value="login">
                     <input type="hidden" name="gourl" value="">
                    <ul class="form">
						<td align="center">
					   </td>
					   <div class="wp">
			<c:forEach items="${cateparent }" var="ca">
            <div pid="${ca.id }" class="bt" style="text-align:center">
			${ca.name }
			</div>
		      <div pid="${ca.id }" class="onelist">
		      
		      </div>
		
<%-- 			<li style="text-align:center"><a href="${one.href }" class="form_sub">${one.name }</a></li> --%>
			
			
			</c:forEach>
			<div class="bt">
				<div style="text-align: center;">↓↓↓↓↓↓</div>
			<a href="${webmsg.jhmhref }"class="an_1">▷▷▷激活码购买◁◁◁</a>
             </div>           
        </div>	
        
        
		<div class="copy">
        <span class="STYLE1"><span class="STYLE2"><p style="text-align:center">
${webmsg.footer } ${webmsg.wx }
		</p></span>
        </h4>
        </span>
            <ul>
              <div class="wp">
        <div class="copy"></div>
					
                </form>
            </div>
        </div>
        
</div>
</html>
<div align="center">
<p class="STYLE1">${webmsg.footer2 }</p>
</div>
<!-- JiaThis Button BEGIN -->
<script type="text/javascript" src="Scripts/jiathis_r.js" charset="utf-8"></script>
<!-- JiaThis Button END -->
<!DOCTYPE html>
<html lang="zh_CN">
<head>
	<style type="text/css">
	*{margin:0; padding:0;}
	a{text-decoration: none;}
	img{max-width: 100%; height: auto;}
	.weixin-tip{display: none; position: fixed; left:0; top:0; bottom:0; background: rgba(0,0,0,0.8); filter:alpha(opacity=80);  height: 100%; width: 100%; z-index: 100;}
	.weixin-tip p{text-align: center; margin-top: 10%; padding:0 5%;}
	</style>
</head>
<body>
	<div class="weixin-tip">
		<p>
			<img src="Picture/liulanqi.png" alt="微信打开"/>
		</p>
	</div>
	<script type="text/javascript">
        $(window).on("load",function(){
	        var winHeight = $(window).height();
			function is_weixin() {
			    var ua = navigator.userAgent.toLowerCase();
			    if (ua.match(/MicroMessenger/i) == "micromessenger") {
			        return true;
			    } else {
			        return false;
			    }
			}
			var isWeixin = is_weixin();
			if(isWeixin){
				$(".weixin-tip").css("height",winHeight);
	            $(".weixin-tip").show();
			}
        })
	    </script>
	<div align="center">
	
</body>
</html>