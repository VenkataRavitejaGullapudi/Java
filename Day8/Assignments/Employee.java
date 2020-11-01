package com.java.day8_assign;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String designation;
    Scanner sc = new Scanner(System.in);

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Designation: ");
        designation = sc.nextLine();
    }

    public void display()
    {
        System.out.println("The Name is "+name);
        System.out.print("The Age is ");
        System.out.println(age);
        System.out.println("The salary is "+salary);
        System.out.println("The Designation is "+designation);
    }


}

