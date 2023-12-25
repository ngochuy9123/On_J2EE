package com.example.j2ee_lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet("/form")
@MultipartConfig
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/view/form.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Lấy giá trị từ các trường của form
        String selectedOption = req.getParameter("selectOption");
        String inputInfo = req.getParameter("inputInfo");

        // Xử lý tệp hình ảnh tải lên (nếu có)
        Part filePart = req.getPart("imageUpload");
        String fileName = filePart.getSubmittedFileName();
        // Đoạn mã xử lý tệp ở đây nếu cần
        System.out.println(selectedOption);
        System.out.println(fileName);
        String uploadDir = getServletContext().getRealPath("/") + "uploads" + File.separator;
        String filePath = uploadDir + fileName;


        try (InputStream input = filePart.getInputStream()) {
            Files.createDirectories(Path.of(uploadDir));
            Files.copy(input, FileSystems.getDefault().getPath(filePath));
        }

        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h2>Thông tin từ form:</h2>");
        resp.getWriter().println("<p>Tên tệp đã tải lên: " + fileName + "</p>");
        resp.getWriter().println("<p>Đường dẫn tệp lưu trữ: " + filePath + "</p>");
        resp.getWriter().println("</body></html>");

    }
}
