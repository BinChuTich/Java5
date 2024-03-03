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
<form:form modelAttribute="nhanVien" action="/nhanvien/add" method="post">
    <div class="form-group">
        <label>ma</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Ho</label>
        <form:input path="ho"></form:input>
    </div>
    <div class="form-group">
        <label>Ten dem</label>
        <form:input path="ten_dem"></form:input>
    </div>
    <div class="form-group">
        <label>Ten</label>
        <form:input path="ten"></form:input>
    </div>
    <div>
        <label for="contacChoice3">Gioi Tinh</label><br>
        <form:radiobutton path="gioi_tinh" id="contactChoice2" value="Nam"></form:radiobutton>
            <%--        <input type="radio" id="contactChoice2" name="gioiTinh" value="Nam"/>--%>
        <label for="contactChoice2">Nam</label>
        <form:radiobutton path="gioi_tinh" id="contacChoice3" value="Nữ"></form:radiobutton>
            <%--        <input type="radio" id="contactChoice3" name="gioiTinh" value="Nu"/>--%>
        <label for="contacChoice3">Nu</label>
    </div>
    <div class="form-group">
        <label>Ngay sinh</label>
        <form:input path="ngay_sinh"></form:input>
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
        <label>Mat khau</label>
        <form:input path="mat_khau"></form:input>
    </div>
    <div class="form-group">
        <label>Id cua hang</label>
        <form:input path="id_ch"></form:input>
    </div>
    <div class="form-group">
        <label>Id chuc vu</label>
        <form:input path="id_cv"></form:input>
    </div>
    <%--    <div class="form-group">--%>
    <%--        <label>ID gui bc</label>--%>
    <%--        <form:input path="id_gui_bc"></form:input>--%>
    <%--    </div>--%>
    <div class="form-group">
        <label>Trang thai</label>
        <form:input path="trang_thai"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Them</button>
</form:form>


<table class="table">
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Ho Ten</th>
        <th scope="col">Gioi Tinh</th>
        <th scope="col">Ngay Sinh</th>
        <th scope="col">Dia Chi</th>
        <th scope="col">So dien thoai</th>
        <th scope="col">Mat khau</th>
        <th scope="col">id_ch</th>
        <th scope="col">Id_cv</th>
        <th scope="col">Id_gui_bc</th>
        <th scope="col">Trang thai</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstNhanVien}" var="nv">
        <tr>
            <td>${nv.ma} </td>
            <td>${nv.ten} </td>
            <td>${nv.gioi_tinh} </td>
            <td>${nv.ngay_sinh} </td>
            <td>${nv.dia_chi} </td>
            <td>${nv.sdt} </td>
            <td>${nv.mat_khau} </td>
            <td>${nv.id_ch} </td>
            <td>${nv.id_cv}</td>
            <td>${nv.id_gui_bc} </td>
            <td>${nv.trang_thai} </td>
            <td><a href="/nhanvien/deletenhanvien/${nv.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/nhanvien/detailnhanvien/${nv.id}" class="btn btn-secondary">Chi Tiet</a></td>
            <td><a href="nhanvien/suanhanvien/${nv.id}" class="btn btn-warning">Sua</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>