package com.example.first_servlet;

import java.io.*;
import java.sql.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String address = request.getParameter("address");
        String age = request.getParameter("age");
        String maritalStatus = request.getParameter("maritalStatus");
        String bloodGroup = request.getParameter("bloodGroup");
        String religion = request.getParameter("religion");
        String nationality = request.getParameter("nationality");
        String education = request.getParameter("education");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Submitted Information:</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Father's Name: " + fatherName + "</p>");
        out.println("<p>Mother's Name: " + motherName + "</p>");
        out.println("<p>Address: " + address + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("<p>Marital Status: " + maritalStatus + "</p>");
        out.println("<p>Blood Group: " + bloodGroup + "</p>");
        out.println("<p>Religion: " + religion + "</p>");
        out.println("<p>Nationality: " + nationality + "</p>");
        out.println("<p>Educational Qualification: " + education + "</p>");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user_info", "Ratul", ""
            );

            String sql = "INSERT INTO personal_info (name, father_name, mother_name, address, age, marital_status, blood_group, religion, nationality, education) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, fatherName);
            pst.setString(3, motherName);
            pst.setString(4, address);
            pst.setInt(5, Integer.parseInt(age));
            pst.setString(6, maritalStatus);
            pst.setString(7, bloodGroup);
            pst.setString(8, religion);
            pst.setString(9, nationality);
            pst.setString(10, education);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<p><strong>Data inserted successfully into database.</strong></p>");
            }

            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        }

        out.println("</body></html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("index.jsp");
    }
}
