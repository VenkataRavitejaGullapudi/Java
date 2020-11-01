package com.java.day4;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    String city;
    Scanner sc = new Scanner(System.in);
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------- Enter the employee details -------------------");
        System.out.print("Enter name of employee: ");
        name = sc.nextLine();
        System.out.print("Enter age of employee: ");
        age = sc.nextInt();
        System.out.print("Enter city of employee: ");
        city = sc.next();
    }
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
