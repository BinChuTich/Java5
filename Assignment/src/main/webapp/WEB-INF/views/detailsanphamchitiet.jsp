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
<form:form cssClass="" cssStyle="" modelAttribute="sanPhamChiTiet" action="/tonghopsanpham/update/${sanPhamChiTiet.id}"
           method="post">
    <div class="form-group">
        <label>Tên sản phẩm</label>
        <form:select path="sanPham">
            <c:forEach items="${lstSanPham}" var="sp">
                <form:option value="${sp.id}"
                             selected="${sp.id eq sanPhamChiTiet.sanPham.id ? 'selected' : ''}">${sp.ten}</form:option>
            </c:forEach>
        </form:select>
    </div>
    <div class="form-group">
        <label>Màu</label>
        <div class="col-sm-10">
            <form:select path="mauSac">
                <c:forEach items="${lstMauSac}" var="mau">
                    <form:option value="${mau.id}"
                                 selected="${sp.id eq sanPhamChiTiet.sanPham.id ?'selected':''} ">${mau.ten}</form:option>
                </c:forEach>
            </form:select>
        </div>
    </div>
    <div>
        <label>Mô tả</label>
        <form:input path="mo_ta"></form:input>
    </div>
    <div>
        <label>Số lượng</label>
        <form:input path="so_luong_ton"></form:input>
    </div>
    <div>
        <label>Năm bảo hành</label>
        <form:input path="nam_bh"></form:input>
    </div>
    <div class="form-group">
        <label>Dòng sản phẩm</label>
        <form:select path="dongSanPham">
            <c:forEach items="${lstDongSanPham}" var="dsp">
                <form:option value="${dsp.id}"
                             selected="${dsp.id eq sanPhamChiTiet.dongSanPham.id ?'selected':''}">${dsp.ten}</form:option>
            </c:forEach>
        </form:select>
    </div>
    <div>
        <label>Giá nhập</label>
        <form:input path="gia_nhap"></form:input>
    </div>
    <div>
        <label>Giá bán</label>
        <form:input path="gia_ban"></form:input>
    </div>
    <div class="form-group">
        <label>Nhà sản xuất</label>
        <form:select path="nhaSanXuat">
            <c:forEach items="${nhaSanXuat}" var="nsx">
                <form:option value="${nsx.id}"
                             selected="${nsx.id eq sanPhamChiTiet.nhaSanXuat.id ? 'selected':''}">${nsx.ten}</form:option>
            </c:forEach>
        </form:select>
    </div>
    <button type="submit" class="btn btn-primary">Sửa</button>
</form:form>
</body>
</html>
