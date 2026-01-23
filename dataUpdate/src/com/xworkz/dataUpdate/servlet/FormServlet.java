package com.xworkz.dataUpdate.servlet;

import com.xworkz.dataUpdate.dto.FormDTO;
import com.xworkz.dataUpdate.service.FormValidation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/form" , loadOnStartup = 1)
public class FormServlet extends HttpServlet {

    public FormServlet(){
        System.out.println("FormServlet Object Creation...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        long phoneNumber = Long.parseLong(req.getParameter("phoneNumber"));

        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("PhoneNumber : "+phoneNumber);

        FormDTO dto = new FormDTO(id,name,phoneNumber);
        FormValidation validation = new FormValidation();

        try {
            boolean value = validation.formSavingValidation(dto);
        }catch (Exception e){
            e.printStackTrace();
        }

        req.setAttribute("msg","Message Saved Successfully.");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);

    }
}
