package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private int a = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        try(PrintWriter writer = resp.getWriter()){
            writer.write("<h2>" + a + "</h2>");
            writer.write("<div>");
            writer.write(req.getPathInfo());
            writer.write("<br>");
            writer.write(req.getMethod());
            writer.write("<br>");
            writer.write(req.getLocalAddr());
            writer.write("<br>");
            writer.write(req.getRequestedSessionId());
            writer.write("<br>");
            writer.write("</div>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        a++;
    }
}