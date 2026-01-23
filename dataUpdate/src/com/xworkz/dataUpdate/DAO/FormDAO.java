package com.xworkz.dataUpdate.DAO;

import com.xworkz.dataUpdate.dto.FormDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FormDAO {

    public void jdbcConnection(FormDTO dto){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/update_db";
            String username = "root";
            String password = "root";
            String query = "insert into updateForm_tb values (?,?,?)";

            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1,dto.getId());
            statement.setString(2,dto.getName());
            statement.setLong(3,dto.getPhoneNumber());

            int rows = statement.executeUpdate();

            if (rows!=0){
                System.out.println("Rows affected : "+rows);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
