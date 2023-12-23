package com.example.j2ee_lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.*;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idsp = req.getParameter("idsp");

        if (idsp != null){

            HttpSession session = req.getSession();

            Map<Integer, Integer> cartMap = (HashMap<Integer, Integer>) session.getAttribute("cart");

            if (cartMap == null){
                cartMap = new HashMap<>();
            }

            List<SanPham> products = (ArrayList<SanPham>)  session.getAttribute("products");


            int productId = Integer.parseInt(idsp);
            if (cartMap.containsKey(productId)){
                cartMap.put(productId,cartMap.get(productId)+1);
            }
            else{
                cartMap.put(productId,1);
            }

            for (SanPham sp:products) {

                if (sp.getId() == productId) {
                    sp.setSlg(sp.getSlg() - 1);
                    System.out.println("Add to cart success");
                    break;
                }
            }

            session.setAttribute("cart",cartMap);
            session.setAttribute("products",products);

            req.getRequestDispatcher("/view/session.jsp").forward(req, resp);
        }
        else{
            req.getRequestDispatcher("/view/cart.jsp").forward(req, resp);
        }

    }
}
