<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isErrorPage="true"%>
     <%response.setStatus(HttpServletResponse.SC_OK);%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error</title>
<script type="text/javascript">
  window.onload = function(){
	  setTimeout(function(){
          window.history.back();
       },1000);
  }

    </script>
</head>
<body wi>
    出错了  正在返回...
    
</body>
</html>