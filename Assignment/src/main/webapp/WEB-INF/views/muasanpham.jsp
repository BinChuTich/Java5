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
<form:form cssClass="" cssStyle="" modelAttribute="chiTietSanPham" action="/tonghopsanpham/add" method="post">
    <div>
        <label>Tên sản phẩm</label>
        <form:select path="sanPham">
            <c:forEach items="${lstSanPham}" var="sp">
                <form:option value="${sp.id}">${sp.ten}</form:option>
            </c:forEach>
        </form:select>
    </div>
    <div class="form-group">
        <label>Màu</label>
        <div class="col-sm-10">
            <form:select path="mauSac">
                <c:forEach items="${lstMauSac}" var="mau">
                    <form:option value="${mau.id}">${mau.ten}</form:option>
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
    <div>
        <label>Dòng sản phẩm</label>
        <form:select path="dongSanPham">
            <c:forEach items="${lstDongSanPham}" var="dsp">
                <form:option value="${dsp.id}">${dsp.ten}</form:option>
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
    <div>
        <label>Nhà sản xuất</label>
        <form:select path="nhaSanXuat">
            <c:forEach items="${nhaSanXuat}" var="nsx">
                <form:option value="${nsx.id}">${nsx.ten}</form:option>
            </c:forEach>
        </form:select>
    </div>
    <button type="submit" class="btn btn-primary">Thêm</button>
</form:form>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Tên sản phâm</th>
        <th scope="col">Màu</th>
        <th scope="col">Mô tả</th>
        <th scope="col">số lượng</th>
        <th scope="col">Năm bảo hành</th>
        <th scope="col">Dòng sản phẩm</th>
        <th scope="col">Giá nhập</th>
        <th scope="col">Giá bán</th>
        <th scope="col">Nhà sản xuất</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstSanPhamChiTiet}" var="sp">
        <tr>
            <td>${sp.sanPham.ten} </td>
            <td>${sp.mauSac.ten} </td>
            <td>${sp.mo_ta}</td>
            <td>${sp.so_luong_ton}</td>
            <td>${sp.nam_bh}</td>
            <td>${sp.dongSanPham.ten}</td>
            <td>${sp.gia_nhap}</td>
            <td>${sp.gia_ban}</td>
            <td>${sp.nhaSanXuat.ten}</td>
            <td><a href="/tonghopsanpham/delete/${sp.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/tonghopsanpham/detail/${sp.id}" class="btn btn-secondary">Chi Tiet</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>