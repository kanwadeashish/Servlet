package com.xworkz.book.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/passBook" , loadOnStartup = 1)
public class PassBook extends GenericServlet {

    public PassBook(){
        System.out.println("PassBook object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("PassBook initialised");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Passbook service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("PassBook is destroyed");
    }
}
