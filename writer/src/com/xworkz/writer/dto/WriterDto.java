package com.xworkz.writer.dto;

import java.util.Objects;

public class WriterDto {

    private String name ;
    private String surname ;
    private String email ;
    private String phoneNumber;
    private String password ;

    public WriterDto(String name, String surname, String email, String phoneNumber, String password) {
        this.name = name;
        this.surname=surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "WriterDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WriterDto writerDto = (WriterDto) o;
        return Objects.equals(name, writerDto.name) && Objects.equals(surname, writerDto.surname) && Objects.equals(email, writerDto.email) && Objects.equals(phoneNumber, writerDto.phoneNumber) && Objects.equals(password, writerDto.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, phoneNumber, password);
    }

}
