<%@ page import="com.jnu.domain.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    User currentUser = null;
    HttpSession userSession = request.getSession();
    if (userSession.getAttribute("currentUser") instanceof User) {
        currentUser = (User)session.getAttribute("currentUser");
    }
    session.setAttribute("rootPath", request.getContextPath());
%>

<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1">--%>

<%--    <link href="${rootPath}/js/bootstrap/css/bootstrap.min1.css" rel="stylesheet">--%>
<%--    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">--%>
<%--    <link rel="stylesheet" href="${rootPath}/js/bootstrap-table/bootstrap-table.css">--%>

<%--    <script src="${rootPath}/js/bootstrap/html5shiv.min.js"></script>--%>
<%--    <script src="${rootPath}/js/bootstrap/respond.min.js"></script>--%>

<%--    <script type="text/javascript" src="${rootPath}/js/jquery/jquery.min.js"></script>--%>
<%--    <script type="text/javascript" src="${rootPath}/js/bootstrap/bootstrap.min.js"></script>--%>
<%--    <script src="${rootPath}/js/bootstrap-table/bootstrap-table.js"></script>--%>
<%--    <script src="${rootPath}/js/bootstrap-table/bootstrap-table-locale-zh-CN.js"></script>--%>