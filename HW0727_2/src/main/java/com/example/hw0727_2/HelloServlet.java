package com.example.hw0727_2;

import java.io.*;
import java.sql.*;


import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        /*PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");*/

        try{
            String url = "jdbc:mysql://localhost:8080/HW0727";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                String sqlCommand = "CREATE TABLE Cars (Id INT PRIMARY KEY AUTO_INCREMENT, Mark VARCHAR(20), " +
                        "Model VARCHAR(20),  Price INT)";
                Statement statement = conn.createStatement();
                statement.executeUpdate(sqlCommand);
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<h1>" + "Database has been created!" + "</h1>");
                out.println("</body></html>");
            }
        }
        catch (Exception ex) {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + ex.getClass() + "</h1>");
            out.println("</body></html>");
        }
    }

    public void destroy() {
    }
}