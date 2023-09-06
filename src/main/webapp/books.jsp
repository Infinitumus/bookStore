<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Books</title>
    <%@ page import="com.bookstore.models.Book"%>
    <%@ page import="java.util.List"%>
</head>
<body>
    <%
        List<Book> books = (List<Book>)request.getAttribute("books");
        for (int i = 0; i < books.size(); i++){
        %>
        <p>
           <%=books.get(i).toString()%>
                   </p>
    <%}%>
</body>
</html>