package com.xworkz.passPort.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet (urlPatterns = "/passPort")
public class PassPort extends GenericServlet {

    public PassPort(){
        System.out.println("Object creation");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Passport initialised");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("Passport destroyed");
    }
}