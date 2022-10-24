package com.example.ltdd_contenprovider_project;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name,Phone;
    public Contact(String name,String phone){
        this.name=name;
        Phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    @Override
    public String toString() {
        return "Tên" + name + "\nPhone: "+this.Phone;
    }
}
