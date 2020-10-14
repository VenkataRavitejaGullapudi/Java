package com.java.day4_assign;

import java.util.Scanner;

public class Avenger {
    String name;
    int age;
    String power;
    String weapon;
    String planet;
    Scanner sc = new Scanner(System.in);
    public void getDetails() {
        System.out.print("Enter the name of Avenger: ");
        name = sc.nextLine();
        System.out.print("Enter the age of Avenger: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the power of Avenger: ");
        power= sc.nextLine();
        System.out.print("Enter the weapon of Avenger: ");
        weapon = sc.nextLine();
        System.out.print("To which planet Avenger belongs to : ");
        planet = sc.nextLine();

    }
    public void displayDetails(){
        System.out.println("Name of Avenger: "+name);
        System.out.println("Age of Avenger: "+age);
        System.out.println("Power of Avenger: "+power);
        System.out.println("Weapon of Avenger: "+weapon);
        System.out.println("Planet of Avenger: "+planet);
    }
}
