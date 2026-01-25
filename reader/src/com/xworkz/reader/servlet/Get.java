package com.xworkz.reader.servlet;

import com.xworkz.reader.dto.ReaderDto;
import com.xworkz.reader.service.ReaderValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/get" , loadOnStartup = 1)
public class Get extends HttpServlet {

    public Get(){
        System.out.println("Get Object...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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

        ReaderDto dto = new ReaderDto(name,surname,email,phoneNumber,password);
        ReaderValidation validation = new ReaderValidation();
        boolean value = validation.readerValidation(dto);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();
        writer.println("Form Submitted Successfully.");

    }
}
