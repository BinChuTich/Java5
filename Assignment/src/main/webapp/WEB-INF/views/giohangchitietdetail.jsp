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
</body>
</html>