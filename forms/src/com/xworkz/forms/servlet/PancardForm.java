package com.xworkz.forms.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/pancard" , loadOnStartup = 3)
public class PancardForm extends GenericServlet {

    public PancardForm(){
        System.out.println("Pancard object initiated.");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Pancard service method called.");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

