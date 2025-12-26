package com.xworkz.forms.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/adhaar" , loadOnStartup = 2)
public class AdhaarForm extends GenericServlet {

    public AdhaarForm(){
        System.out.println("Adhaar object initiated.");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Adhaar service method called.");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
