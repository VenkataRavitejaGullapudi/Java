package com.java.day8_assign;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String designation;
    Scanner sc = new Scanner(System.in);


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
        System.out.print("Enter Designation of employee: ");
        designation = sc.nextLine();
    }

    public void display()
    {
        System.out.println("The Name of Employee is "+name);
        System.out.print("The Age of Employee is ");
        System.out.println(age);
        System.out.println("The salary of Employee is "+salary);
        System.out.println("The Designation of Employee is "+designation);
    }


}

