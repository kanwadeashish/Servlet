package com.xworkz.dataUpdate.service;

import com.xworkz.dataUpdate.DAO.FormDAO;
import com.xworkz.dataUpdate.dto.FormDTO;
import com.xworkz.dataUpdate.exception.InvalidDataException;

public class FormValidation {

    public boolean formSavingValidation(FormDTO dto) throws InvalidDataException {

        if (dto.getId()!=0 && dto.getName()!=null && dto.getPhoneNumber()!=0){

            FormDAO dao = new FormDAO();
            dao.jdbcConnection(dto);

            System.out.println("The inserted values are valid and are saved in DB.");
            return true;
        }else {
            throw new InvalidDataException();
        }

    }

}
