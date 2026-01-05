package com.xworkz.rapido.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/rapido" , loadOnStartup = 1)
public class Rapido extends HttpServlet {

    public Rapido(){
        System.out.println("Rapido object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Username : "+username);
        System.out.println("Password : "+password);

    }

}
