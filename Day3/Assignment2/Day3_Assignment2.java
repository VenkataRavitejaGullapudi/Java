package com.java.day3_assign;

import java.util.Scanner;

public class Day3_Assignment2 {
    public static void main(String [] args) {
        String name;
        int date;
        int month;
        int year;
        float month_salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------Enter the emoloyee details asked below to calculate Tax------------");
        System.out.print("Enter employee name(Only single word): ");
        name = sc.next();
        System.out.print("Enter date in integer(in the date of birth): ");
        date = sc.nextInt();
        System.out.print("Enter month in integer(in the date of birth): ");
        month = sc.nextInt();
        System.out.print("Enter year(in the date of birth): ");
        year = sc.nextInt();
        System.out.print("Enter monthly salary: ");
        month_salary = sc.nextFloat();
        System.out.println();
        System.out.println("--------------Employee details Mentioned Above ------------");
        Employee e = new Employee();
        e.setData(name,date,month,year,month_salary);
        System.out.println("Name of the employee: "+e.name);
        System.out.println("Age of the employee: "+ e.calculateAge());
        System.out.println("Annual Salary of the employee: "+e.year_sal);
        System.out.println();
        System.out.println("*** Make note that age is calculated in a way that if your birthday is tomorrow and year of birth may be 1998, Your age today is only 21  ***");
        System.out.println();
        System.out.println("--------------Calculated Tax amount------------");
        System.out.print("####--- ");
        e.calculateTax();
        System.out.println(" ---####");

    }
}

