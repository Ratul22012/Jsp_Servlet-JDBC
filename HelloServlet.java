package com.example.first_servlet;
import java.io.*;
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
        out.println("</body></html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("index.jsp");
    }
}
