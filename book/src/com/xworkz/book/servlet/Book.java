package com.xworkz.book.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/book" , loadOnStartup = 3)
public class Book extends GenericServlet {

    public Book(){
        System.out.println("Book object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Book initialised");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Book service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("Book is destroyed");
    }
}

