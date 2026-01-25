package com.xworkz.reader.service;

import com.xworkz.reader.dto.ReaderDto;

public class ReaderValidation {

    public boolean readerValidation(ReaderDto dto){

        if (dto.getName()!=null && dto.getSurname()!=null && dto.getEmail()!=null && dto.getPhoneNumber()!=null && dto.getPassword()!=null){
            return true;
        } else {
            return false;
        }

    }

}
