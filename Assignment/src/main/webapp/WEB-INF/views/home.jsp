<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<!DOCTYPE html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/css/css.css"/>
    <title>Title</title></head>
<body>
<div class="navbar">
    <a href="/Assignment/show" class="home">Home</a>
    <input style="width: 500px" type="text" placeholder="Tìm kiếm...">
    <button class="search">Tìm</button>
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/chucvu/hienthi">Quản lý chức vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/cuahang/hienthi">Quản lý cửa hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/dongsanpham/hienthi">Dòng sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/giohang/hienthi">Giỏ hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/hoadon/hienthi">Hóa đơn</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/hoadonchitiet/hienthi">Hóa đơn chi tiết</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/khachhang/hienthi">Khách hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/nhanvien/hienthi">Nhân viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/nhasanxuat/hienthi">Nhà sản xuất</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/sanpham/hienthi">Sản phẩm</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="row">
    <c:forEach items="${lstSanPhamChiTiet}" var="l">
        <div class=" card col-md-4 mb-3" style="width: 18rem;">
            <div class="card-body">
                <h2 style="color: aqua">${l.sanPham.ten}</h2>
                <p>Giá nhập: ${l.gia_nhap}</p>
                <p>Giá bán: ${l.gia_ban}</p>
                <h5>${l.mauSac.ten}</h5>
                <p>Số lượng tồn:${l.so_luong_ton}</p>
                <p>${l.mo_ta} ${l.nhaSanXuat.ten} năm bảo hành ${l.nam_bh}</p>
                <a href="/giohang/hienthi" class="btn btn-outline-primary">Mua</a>
                <a href="/giohang/hienthi" class="btn btn-outline-primary">Thêm vào giỏ hàng</a>
            </div>
        </div>
    </c:forEach>

</div>


</body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
</html>