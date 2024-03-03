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
<form:form modelAttribute="gioHangChiTiet" action="/giohangchitiet/add" method="post">
    <div class="form-group">
        <label>Id gio hang </label>
        <form:input path="id_gio_hang"></form:input>
    </div>
    <div class="form-group">
        <label>Id chi tiet san pham</label>
        <form:input path="id_chi_tiet_sp"></form:input>
    </div>
    <div class="form-group">
        <label>So luong</label>
        <form:input path="so_luong"></form:input>
    </div>
    <div class="form-group">
        <label>Don gia</label>
        <form:input path="don_gia"></form:input>
    </div>

    <div class="form-group">
        <label>Don gia khi giam</label>
        <form:input path="don_gia_khi_giam"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Them</button>
</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Id gio hang</th>
        <th scope="col">Id chi tiet san pham</th>
        <th scope="col">So luong</th>
        <th scope="col">Don gia</th>
        <th scope="col">Don gia khi giam</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstGioHangChiTiet}" var="ghct">
        <tr>
            <td>${ghct.id_gio_hang} </td>
            <td>${ghct.id_chi_tiet_sp} </td>
            <td>${ghct.so_luong} </td>
            <td>${ghct.don_gia} </td>
            <td>${ghct.don_gia_khi_giam} </td>
            <td><a href="/giohangchitiet/delete/${ghct.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/giohangchitiet/detail/${ghct.id}" class="btn btn-secondary">Chi Tiet</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>