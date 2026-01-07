package com.xworkz.twitter.servlet;

import com.xworkz.twitter.dto.TwitterDto;
import com.xworkz.twitter.service.TwitterValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/twitter" , loadOnStartup = 1)
public class Twitter extends HttpServlet {

    public Twitter(){
        System.out.println("Twitter object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        TwitterDto dto = new TwitterDto(name,email,username,password);
        TwitterValidation validation = new TwitterValidation();

        boolean diplayResult = validation.displayValidation(dto);

        PrintWriter printWriter = resp.getWriter();

        if (diplayResult){
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>");
            System.out.println("Twitter Validations");
            System.out.println("</title>");
            System.out.println("</head>");
            System.out.println("<body>");
            System.out.println("Data Added successfully");
            System.out.println("</body>");
            System.out.println("</html>");
        }else {
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>");
            System.out.println("Twitter Validations");
            System.out.println("</title>");
            System.out.println("</head>");
            System.out.println("<body>");
            System.out.println("Data failed to Add");
            System.out.println("</body>");
            System.out.println("</html>");
        }

        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Username : "+username);
        System.out.println("Password : "+password);

    }
}
