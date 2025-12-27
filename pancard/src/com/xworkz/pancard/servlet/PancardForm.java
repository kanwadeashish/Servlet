package com.xworkz.pancard.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/pancard" , loadOnStartup = 1)
public class PancardForm extends GenericServlet {

    public PancardForm(){
        System.out.println("Pancard object initiated.");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Pacard service method is called");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        String mail = servletRequest.getParameter("mail");
        String phone = servletRequest.getParameter("phone");
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Mail = "+mail);
        System.out.println("Phone Number = "+phone);

        PrintWriter printWriter = servletResponse.getWriter();
        servletResponse.setContentType("text");
        printWriter.println("Link submitted successfully");
        printWriter.println("Thank you "+name);
    }
}
