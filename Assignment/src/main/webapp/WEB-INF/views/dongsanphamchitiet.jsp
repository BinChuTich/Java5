<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Title</title>
</head>
<body class="container">
<form:form modelAttribute="dongSanPham" action="/dongsanpham/update/${dongSanPham.id}">
    <div class="form-group">
        <label>Ma</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Ten dong san pham</label>
        <form:input path="ten"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Sua</button>
</form:form>
</body>
</html>
