package com.xworkz.writer.service;

import com.xworkz.writer.dto.WriterDto;

public class WriterValidation {

    public boolean writerValidation(WriterDto dto){

        if (dto.getName()!=null && dto.getSurname()!=null && dto.getEmail()!=null && dto.getPhoneNumber()!=null && dto.getPassword()!=null){
            return true;
        } else {
            return false;
        }

    }

}
