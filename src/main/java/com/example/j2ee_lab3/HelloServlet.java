package com.example.j2ee_lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");

        // Lưu thông tin người dùng vào session
        HttpSession session = request.getSession();
        session.setAttribute("userName", userName);

        response.sendRedirect("hello.jsp");
    }
}