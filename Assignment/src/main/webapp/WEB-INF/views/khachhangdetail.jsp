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
<form:form modelAttribute="khachHang" action="/khachhang/update/${khachHang.id}" method="post">
    <div class="form-group">
        <label>Mã</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Họ</label>
        <form:input path="ho"></form:input>
    </div>
    <div class="form-group">
        <label>Tên đệm</label>
        <form:input path="ten_dem"></form:input>
    </div>
    <div class="form-group">
        <label>Tên</label>
        <form:input path="ten"></form:input>
    </div>
    <div class="form-group">
        <label>Ngày sinh</label>
        <form:input path="ngay_sinh"></form:input>
    </div>
    <div class="form-group">
        <label>Số điện thoại</label>
        <form:input path="sdt"></form:input>
    </div>
    <div class="form-group">
        <label>Địa chỉ</label>
        <form:input path="dia_chi"></form:input>
    </div>
    <div class="form-group">
        <label>Thành phố</label>
        <form:input path="thanh_pho"></form:input>
    </div>
    <div class="form-group">
        <label>Quốc gia</label>
        <form:input path="quoc_gia"></form:input>
    </div>
    <div class="form-group">
        <label>Mật khẩu</label>
        <form:input path="mat_khau"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Sửa</button>
</form:form>
</body>
</html>
