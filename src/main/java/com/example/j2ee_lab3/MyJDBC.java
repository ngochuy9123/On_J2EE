package com.example.j2ee_lab3;

import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab3","root","huy");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        while(resultSet.next()){
            System.out.println(resultSet.getString("tenThueBao"));
        }
    }

}
