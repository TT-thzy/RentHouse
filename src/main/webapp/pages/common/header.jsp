<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";

    pageContext.setAttribute("basePath",basePath);
%>

<!--写base标签，永远固定相对路径跳转的结果-->
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="pages/style/btn.css" rel="stylesheet" type="text/css" />
<link href="pages/style/mycss.css" rel="stylesheet" type="text/css" />
<link href="pages/style/text.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"src="pages/script/jquery-1.7.2.js"></script>