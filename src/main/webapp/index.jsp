<%@ page import="java.net.InetAddress" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page session="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Eagle</title>
</head>
<body>
<%
    String ip = InetAddress.getLocalHost().getHostAddress();
%>
</body>
</html>