<%--
  Created by IntelliJ IDEA.
  User: quan
  Date: 29/09/2021
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/products">Show products list</a>
<h1>Product Create Form</h1>
<form method="post">
    <div>
        <input type="text" placeholder="product name" name="name">
    </div>
    <div>
        <input type="text" placeholder="product price" name="price">
    </div>
    <div>
        <input type="text" placeholder="product description" name="description">
    </div>
    <div>
        <input type="text" placeholder="product image" name="image">
    </div>
    <button>Create</button>
</form>
</body>
</html>
