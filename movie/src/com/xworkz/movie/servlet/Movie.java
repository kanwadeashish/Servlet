package com.xworkz.movie.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)
public class Movie extends GenericServlet {

    public Movie(){
        System.out.println("Movie object created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method");
        String name = servletRequest.getParameter("name");
        String budget = servletRequest.getParameter("budget");
        System.out.println("Movie Name = "+name);
        System.out.println("Movie Budget = "+budget);
    }
}
