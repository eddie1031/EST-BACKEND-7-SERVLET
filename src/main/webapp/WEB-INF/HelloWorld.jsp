<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${number} 단</h1>
<div>
        <%
            int number = (int) request.getAttribute("result");
            for (int i=1; i < 10; i++) {
        %>
    <p>
        <%=number %> * <%=i %> = <%= number * i %>
    </p>
        <%
            }
        %>
</body>
</html>
