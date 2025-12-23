package com.xworkz.book.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/food" , loadOnStartup = 4)
public class Food extends GenericServlet {

    public Food(){
        System.out.println("Food object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Food initialised");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Food service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("Food is destroyed");
    }
}

