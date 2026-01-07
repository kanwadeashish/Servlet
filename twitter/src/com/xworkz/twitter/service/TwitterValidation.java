package com.xworkz.twitter.service;

import com.xworkz.twitter.dto.TwitterDto;

public class TwitterValidation {

    public boolean displayValidation(TwitterDto dto){

        if (dto.getName()!=null && dto.getEmail()!=null && dto.getUsername()!=null && dto.getPassword()!=null){
            return true;
        }else {
            return false;
        }

    }

}
