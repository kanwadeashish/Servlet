package com.xworkz.forms.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/driving" , loadOnStartup = 5)
public class DrivingLincenseForm extends GenericServlet {

    public DrivingLincenseForm(){
        System.out.println("DrivingLincenseForm object initiated.");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("DrivingLincenseForm service method called.");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

