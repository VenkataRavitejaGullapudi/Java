package com.java.ravi;

public class Employee {
    String name;
    int age;
    String city;
    public void setData(String inp_name,int inp_age,String inp_city)
    {
        name = inp_name;
        age = inp_age;
        city = inp_city;

    }
    public void display()
    {
        System.out.println("The Name is "+name);
        System.out.print("The Age is ");
        System.out.println(age);
        System.out.println("The City is "+city);
    }

}
