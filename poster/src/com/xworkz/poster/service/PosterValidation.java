package com.xworkz.poster.service;

import com.xworkz.poster.dto.PosterDto;

public class PosterValidation {

    public boolean posterValidation(PosterDto dto){

        if (dto.getName()!=null && dto.getSurname()!=null && dto.getEmail()!=null && dto.getPhoneNumber()!=null && dto.getPassword()!=null){
            return true;
        } else {
            return false;
        }

    }

}
