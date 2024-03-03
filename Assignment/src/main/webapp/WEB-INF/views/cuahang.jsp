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
<form:form modelAttribute="cuaHang" action="/cuahang/add" method="post">
    <div class="form-group">
        <label>Ma</label>
        <form:input path="ma"></form:input>
    </div>
    <div class="form-group">
        <label>Dia Chi</label>
        <form:input path="dia_chi"></form:input>
    </div>
    <div class="form-group">
        <label>thanh_pho</label>
        <form:input path="thanh_pho"></form:input>
    </div>
    <div class="form-group">
        <label>Quoc Gia</label>
        <form:input path="quoc_gia"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Them</button>
</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Thành phố</th>
        <th scope="col">Quốc gia</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lstCuaHang}" var="ch">
        <tr>
            <td>${ch.ma} </td>
            <td>${ch.dia_chi} </td>
            <td>${ch.thanh_pho} </td>
            <td>${ch.quoc_gia} </td>
            <td><a href="/cuahang/delete/${ch.id}" class="btn btn-primary"> Xoa</a></td>
            <td><a href="/cuahang/detail/${ch.id}" class="btn btn-secondary">Chi Tiet</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>