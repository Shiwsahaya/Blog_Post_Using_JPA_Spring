<%@ page import="net.blog.post.model.Posts" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: shiw
  Date: 24/12/19
  Time: 11:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h3><a href="new">New Post</a></h3>
<% List<Posts> results = (List<Posts>) request.getAttribute("listCustomer");%>
<% for (Posts value : results) {%>
<h2>
    <%= value.getTitle()%>
</h2>
<%= value.getBody()%>
<br/>
<a href="edit?id=<%=value.getId()%>">Edit</a><br>
<a href="delete?id=<%=value.getId()%>">Delete</a>
<%}%>
</body>
</html>
