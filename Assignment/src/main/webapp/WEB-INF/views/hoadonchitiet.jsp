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
<form:form modelAttribute="hoaDonChiTiet" action="/hoadonchitiet/add" method="post">
    <div class="form-group">
        <label class="form-label">Id hoa don</label>
        <form:input class="from-control" path="id.id_hoa_don.id"></form:input>
    </div>
    <div class="form-group">
        <label>Id chi tiet san pham</label>s
        <form:input path="id.idChiTietSanPham.id"></form:input>
    </div>
    <div class="form-group">
        <label>So luong</label>
        <form:input path="so_luong"></form:input>
    </div>
    <div class="form-group">
        <label>Don gia</label>
        <form:input path="don_gia"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Them</button>
</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID hoa don chi tiet</th>
        <th scope="col">ID Chi tiet san pham</th>
        <th scope="col">So luong</th>
        <th scope="col">Don gia</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lst}" var="hdct">
        <tr>
            <td>${hdct.id.id_hoa_don.getId()} </td>
            <td>${hdct.id.idChiTietSanPham.getId()} </td>
            <td>${hdct.so_luong} </td>
            <td>${hdct.don_gia} </td>
            <td><a href="/hoadonchitiet/delete/${hdct.id.id_hoa_don.getId()}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/hoadonchitiet/detail/${hdct.id.id_hoa_don.getId()}" class="btn btn-secondary">Chi Tiet</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>