<%@ page import="com.example.j2ee_lab3.SanPham" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.j2ee_lab3.Cart" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2023
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gio Hang</title>
</head>
<body>
    <table >
        <tr>
            <td>Id</td>
            <td>Ten San Pham</td>
            <td>Gia</td>
            <td>So Luong</td>
            <td></td>
        </tr>

        <%
            Map<Integer,Integer> cartMap = (HashMap<Integer, Integer>) session.getAttribute("cart");
            List<SanPham> products = (ArrayList<SanPham>) session.getAttribute("products");

            for (int idsp : cartMap.keySet()) {
                for (SanPham sp:products) {
                     if (sp.getId() == idsp){


        %>
        <tr>
            <td><%= idsp%></td>
            <td><%= sp.getTensp() %></td>
            <td><%= cartMap.get(idsp) %></td>
            <td><%= cartMap.get(idsp) * sp.getGia() %></td>
        </tr>
        <%
                    }

                }
            }
        %>
    </table>



</body>
</html>
