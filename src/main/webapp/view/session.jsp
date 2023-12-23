<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.j2ee_lab3.SanPham" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/21/2023
  Time: 9:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn Session</title>
</head>
<body>
    <h2>Hello, <%= session.getAttribute("name") %>!</h2>

    <table >
        <tr>
            <td>Id</td>
            <td>Ten San Pham</td>
            <td>Gia</td>
            <td>So Luong</td>
            <td></td>
        </tr>

        <%
            List<SanPham> list = (ArrayList<SanPham>) session.getAttribute("products");
            for (SanPham sp : list) {
        %>
        <tr>
            <td><%= sp.getId() %></td>
            <td><%= sp.getTensp() %></td>
            <td><%= sp.getGia() %></td>
            <td><%= sp.getSlg() %></td>
            <td><a href="${pageContext.request.contextPath}/cart?idsp=<%= sp.getId() %>"><button>Mua Hang</button></a></td>
        </tr>
        <%
            }
        %>
    </table>

    <a href="${pageContext.request.contextPath}/cart">Xem Gio Hang</a>
</body>
</html>
