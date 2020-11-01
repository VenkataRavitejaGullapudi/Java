package com.java.day6;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String city;
    Scanner sc = new Scanner(System.in);

    Employee(){
        System.out.println("In Constructor");
    }

    // To only to see this age outside
    public int getAge(){
        return age;
    }

    //To edit or update the age
    public void setAge(int age){
        this.age=age;
    }

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
    public void setData(String name,int age,String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;

    }
    public void display()
    {
        System.out.println("The Name is "+name);
        System.out.print("The Age is ");
        System.out.println(age);
        System.out.println("The City is "+city);
    }

}

