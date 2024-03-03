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
<form:form modelAttribute="gioHang" action="/giohang/add" method="post">
    <div class="form-group">
        <label>Mã khách hàng</label>
        <form:input path="id_kh"></form:input>
    </div>
    <div class="form-group">
        <label>Mã nhân viên</label>
        <form:input path="id_nv"></form:input>
    </div>
    <div class="form-group">
        <label>Ma</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Ngay tao</label>
        <form:input path="ngay_tao"></form:input>
    </div>

    <div class="form-group">
        <label>Ngay thanh toan</label>
        <form:input path="ngay_thanh_toan"></form:input>
    </div>
    <div class="form-group">
        <label>Ten nguoi nhan</label>
        <form:input path="ten_nguoi_nhan"></form:input>
    </div>
    <div class="form-group">
        <label>Dia chi</label>
        <form:input path="dia_chi"></form:input>
    </div>
    <div class="form-group">
        <label>So dien thoai</label>
        <form:input path="sdt"></form:input>
    </div>
    <div class="form-group">
        <label>Tinh trang</label>
        <form:input path="tinh_trang"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Thanh toán</button>
</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Ma khach hang</th>
        <th scope="col">Ma nhan vien</th>
        <th scope="col">Ma Hoa don</th>
        <th scope="col">Ngay tao</th>
        <th scope="col">Ngay thanh toan</th>
        <th scope="col">Ten nguoi nhan</th>
        <th scope="col">Dia chi</th>
        <th scope="col">So dien thoai</th>
        <th scope="col">Tinh trang</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstGioHang}" var="gh">
        <tr>
            <td>${gh.id_kh} </td>
            <td>${gh.id_nv} </td>
            <td>${gh.ma} </td>
            <td>${gh.ngay_tao} </td>
            <td>${gh.ngay_thanh_toan} </td>
            <td>${gh.ten_nguoi_nhan} </td>
            <td>${gh.dia_chi} </td>
            <td>${gh.sdt} </td>
            <td>${gh.tinh_trang}</td>
            <td><a href="/giohang/delete/${gh.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/giohang/detail/${gh.id}" class="btn btn-secondary">Chi Tiet</a></td>
            <td><a href="/giohangchitiet/detail/${gh.id}" class="btn btn-secondary">Thanh toan</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>