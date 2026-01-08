package com.xworkz.survey.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/adhaar",loadOnStartup = 2)
public class AdhaarForm extends HttpServlet {

    public AdhaarForm(){
        System.out.println("AdhaarForm Object Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String password = req.getParameter("password");

        System.out.println("Name :"+name);
        System.out.println("SurName :"+surname);
        System.out.println("Email :"+email);
        System.out.println("Phone Number :"+phoneNumber);
        System.out.println("Password :"+password);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();
        writer.println("Form Submitted Successfully.");
    }
}
