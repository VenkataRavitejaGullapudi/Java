package com.java.day7;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double salary;
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

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------- Enter the employee details -------------------");
        System.out.print("Enter name of employee: ");
        name = sc.nextLine();
        System.out.print("Enter age of employee: ");
        age = sc.nextInt();
        System.out.print("Enter salary of employee: ");
        salary = sc.nextDouble();
    }
    public void setData(String name,int age,String salary)
    {
        this.name = name;
        this.age = age;
        this.city = salary;

    }
    public void display()
    {
        System.out.println("The Name is "+name);
        System.out.print("The Age is ");
        System.out.println(age);
        System.out.println("The salary is "+salary);
    }
    public void takeLeave(){
        System.out.println("You have 2 days Leave ");
    }

}

