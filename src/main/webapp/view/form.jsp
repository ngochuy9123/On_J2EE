<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/24/2023
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form" method="post" enctype="multipart/form-data">
    <!-- Option Select -->
    <label for="selectOption">Chọn một lựa chọn:</label>
    <select id="selectOption" name="selectOption">
        <option value="SamSung">SamSung</option>
        <option value="Iphone">Iphone</option>
        <option value="Tecno">Tecno</option>
    </select>
    <br>

    <!-- Nhập thông tin -->
    <label for="inputInfo">Nhập thông tin:</label>
    <input type="text" id="inputInfo" name="inputInfo" required>
    <br>

    <!-- Upload hình ảnh -->
    <label for="imageUpload">Chọn hình ảnh:</label>
    <input type="file" id="imageUpload" name="imageUpload" accept="image/*">
    <br>

    <!-- Nút Submit -->
    <input type="submit" value="Submit">
</form>
</body>
</html>
