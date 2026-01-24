package com.xworkz.writer.servlet;

import com.xworkz.writer.dto.WriterDto;
import com.xworkz.writer.service.WriterValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/post" , loadOnStartup = 2)
public class Post extends HttpServlet {

    public Post(){
        System.out.println("Post Object...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String password = req.getParameter("password");

        System.out.println("Name :"+name);
        System.out.println("SurName :"+surname);
        System.out.println("Email :"+email);
        System.out.println("Phone Number :"+phoneNumber);
        System.out.println("Password :"+password);

        WriterDto dto = new WriterDto(name,surname,email,phoneNumber,password);
        WriterValidation validation = new WriterValidation();
        boolean value = validation.writerValidation(dto);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();
        writer.println("Form Submitted Successfully.");

    }
}
