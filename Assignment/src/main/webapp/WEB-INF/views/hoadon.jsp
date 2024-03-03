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
<form:form modelAttribute="hoaDon" action="/hoadon/add" method="post">
    <div class="form-group">
        <label>ma</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Ngày thanh toán</label>
        <form:input path="ngay_thanh_toan"></form:input>
    </div>
    <div class="form-group">
        <label>Ngày ship</label>
        <form:input path="ngay_ship"></form:input>
    </div>
    <div class="form-group">
        <label>Ngày nhận</label>
        <form:input path="ngay_nhan"></form:input>
    </div>
    <div class="form-group">
        <label>Tình trạng</label>
        <form:input path="tinh_trang"></form:input>
    </div>
    <div class="form-group">
        <label>Tên người nhận</label>
        <form:input path="ten_nguoi_nhan"></form:input>
    </div>
    <div class="form-group">
        <label>Địa chỉ</label>
        <form:input path="dia_chi"></form:input>
    </div>
    <div class="form-group">
        <label>Số điện thoại</label>
        <form:input path="sdt"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Them</button>
</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID Khach Hang</th>
        <th scope="col">Id Nhan vien</th>
        <th scope="col">Mã</th>
        <th scope="col">Ngay thanh toan</th>
        <th scope="col">Ngày ship</th>
        <th scope="col">Ngay nhan</th>
        <th scope="col">Tinh trang</th>
        <th scope="col">Ten nguoi nhan</th>
        <th scope="col">Dia chi</th>
        <th scope="col">So dien thoai</th>
        <th scope="col">Chuc nang</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstHoaDon}" var="hd">
        <tr>
            <td>${hd.id_kh} </td>
            <td>${hd.id_nv} </td>
            <td>${hd.ma} </td>
            <td>${hd.ngay_thanh_toan} </td>
            <td>${hd.ngay_ship} </td>
            <td>${hd.ngay_nhan} </td>
            <td>${hd.tinh_trang} </td>
            <td>${hd.ten_nguoi_nhan} </td>
            <td>${hd.dia_chi}</td>
            <td>${hd.sdt} </td>
            <td><a href="/hoadon/delete/${hd.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/hoadon/detail/${hd.id}" class="btn btn-secondary">Chi Tiet</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>