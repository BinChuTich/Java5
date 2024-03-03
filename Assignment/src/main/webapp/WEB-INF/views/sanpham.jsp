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
<form:form modelAttribute="sanPham" action="/sanpham/add" method="post">
    <div class="form-group">
        <label>Ma</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Ten mau</label>
        <form:input path="ten"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Them</button>
</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Tên San Pham</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstSanPham}" var="sp">
        <tr>
            <td>${sp.ma} </td>
            <td>${sp.ten} </td>
            <td><a href="/sanpham/delete/${sp.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/sanpham/detail/${sp.id}" class="btn btn-secondary">Chi Tiet</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>