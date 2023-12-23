package com.example.j2ee_lab3;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SanPham> products = new ArrayList<>();
        products.add(new SanPham(1,"Chuot Gamming",2000,200));
        products.add(new SanPham(2,"Ban phim daeru",500000,320));
        products.add(new SanPham(3,"Man Hinh 21 inch",80000,80));
        products.add(new SanPham(4,"Lot chuot",700000,123));
        products.add(new SanPham(5,"Ghe cong thai hoc",100000,100));
        products.add(new SanPham(6,"Ban nang ha",670000,98));
        products.add(new SanPham(7,"Ban phim Razer",580000,52));
        products.add(new SanPham(8,"Chuot gaming Razer",30000,320));
        products.add(new SanPham(9,"Ban phim Logitech",200000,460));

        HttpSession session = req.getSession();
        session.setAttribute("products",products);
        session.setAttribute("name","nguyen huy 123");
        System.out.println("hello");
        req.getRequestDispatcher("/view/session.jsp").forward(req, resp);
    }
}
