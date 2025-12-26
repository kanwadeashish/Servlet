package com.xworkz.forms.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet (urlPatterns = "/passport" , loadOnStartup = 1)
public class PassportForm extends GenericServlet {

    public PassportForm(){
        System.out.println("Passport object initiated.");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Passport service method called.");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
