<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         import="java.util.*,java.net.*"
         pageEncoding="GBK"%>
<%@ page import="com.cz.NetUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Load Balance Test</title>
</head>
<body>
<%
  InetAddress netAddress = NetUtil.getInetAddress();
  out.println("Successfully access to the host!");
  out.println("Host IP:" + NetUtil.getHostIp(netAddress));
  out.println("Host Name:" + NetUtil.getHostName(netAddress));
%>
</body>
</html>