package com.bdbt_project.ClientAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Workers {
private int id;
private String birth_date;
private String date_of_valid_test;
private String date_of_last_test;
private String date_of_employment;
private String date_of_examption;
private String email;
private String name;
private String lastname;
private String phone_number;
private String pesel;
@Autowired
public Workers(int id, String birth_date, String date_of_valid_test, String date_of_last_test, String date_of_employment, String date_of_examption, String email, String name, String lastname, String phone_number, String pesel, char sex) {
        this.id = id;
        this.birth_date = birth_date;
        this.date_of_valid_test = date_of_valid_test;
        this.date_of_last_test = date_of_last_test;
        this.date_of_employment = date_of_employment;
        this.date_of_examption = date_of_examption;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.phone_number = phone_number;
        this.pesel = pesel;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + id +
                ", birth_date='" + birth_date + '\'' +
                ", date_of_valid_test='" + date_of_valid_test + '\'' +
                ", date_of_last_test='" + date_of_last_test + '\'' +
                ", date_of_employment='" + date_of_employment + '\'' +
                ", date_of_examption='" + date_of_examption + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", pesel='" + pesel + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getDate_of_valid_test() {
        return date_of_valid_test;
    }

    public void setDate_of_valid_test(String date_of_valid_test) {
        this.date_of_valid_test = date_of_valid_test;
    }

    public String getDate_of_last_test() {
        return date_of_last_test;
    }

    public void setDate_of_last_test(String date_of_last_test) {
        this.date_of_last_test = date_of_last_test;
    }

    public String getDate_of_employment() {
        return date_of_employment;
    }

    public void setDate_of_employment(String date_of_employment) {
        this.date_of_employment = date_of_employment;
    }

    public String getDate_of_examption() {
        return date_of_examption;
    }

    public void setDate_of_examption(String date_of_examption) {
        this.date_of_examption = date_of_examption;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    private char sex;

}


