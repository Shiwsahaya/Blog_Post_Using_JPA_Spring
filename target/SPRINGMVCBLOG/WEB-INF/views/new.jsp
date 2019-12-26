<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: shiw
  Date: 25/12/19
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
Create Post
<form:form action="save" method="post" modelAttribute="posts">
    <table border="0" cellpadding="5">
    <tr>
        <td>Title:</td>
        <td><form:input path="title" cssClass="error"/></td>
    </tr>

    <tr>
        <td>Body:</td>
        <td><form:textarea rows="4" cols="50" path="body"/></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="save"></td>
    </tr>
    </table>
</form:form>
</body>
</html>
