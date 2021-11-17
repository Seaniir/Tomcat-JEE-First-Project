package com.example.tomcattest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("val");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Student Resistration Form Data</h1>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        System.out.println("firstName :: " + firstName);
    }
}