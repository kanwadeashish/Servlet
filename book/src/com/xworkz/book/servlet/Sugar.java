package com.xworkz.book.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/sugar" , loadOnStartup = 4)
public class Sugar extends GenericServlet {

    public Sugar(){
        System.out.println("Sugar object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Sugar initialised");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Sugar service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("Sugar is destroyed");
    }
}

