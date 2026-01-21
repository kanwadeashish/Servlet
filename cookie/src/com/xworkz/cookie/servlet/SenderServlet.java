package com.xworkz.cookie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sender")
public class SenderServlet extends HttpServlet {

    public SenderServlet(){
        System.out.println("SenderServlet object creation");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Cookie cookie = new Cookie("receiver",name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
    }
}
