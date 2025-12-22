package com.xworkz.lide_cycle.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet (urlPatterns = "/table", loadOnStartup = 1)
public class Table extends GenericServlet {

    public Table(){
        System.out.println("Table constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Table service is called");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Init called");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy called");
    }
}
