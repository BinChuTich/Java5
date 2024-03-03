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
<form:form modelAttribute="hoaDon" action="/hoadon/update/${hoaDon.id}" method="post">
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
    <button type="submit" class="btn btn-primary">Sua</button>
</form:form>
</body>
</html>