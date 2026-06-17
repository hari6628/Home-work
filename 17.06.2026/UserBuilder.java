/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder02;

public class UserBuilder
{
    private User maker;
    private String name;
    private int age;
    private String email;
    private int phone;
    
    public UserBuilder() {
        maker =new User();
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
    public User Making()
    {
        maker.setName(this.name);
        maker.setAge(this.age);
        maker.setPhone(this.phone);
        maker.setEmail(this.email);
        
        return maker;
    }
    
}
