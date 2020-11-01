package com.java.ProductManagementSystem;

import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);
    private String name;
    private float price;
    private int quantity;
    private String category;
    private int production;
    private boolean isDeleted=false;

    public float getPrice() {
        return price;
    }
    public void setDeleted(boolean isDeleted){
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return isDeleted;
    }


    public void createProduct(){

        System.out.println("-------Please enter all the details related to your product-------");
        System.out.print("Name of the Product: ");
        name = sc.nextLine();
        System.out.print("Category of the Product: ");
        category = sc.nextLine();
        System.out.print("Price of Product: ");
        price = sc.nextFloat();
        System.out.print("Product Quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Production per day: ");
        production = sc.nextInt();
        sc.nextLine();
    }

    public boolean updateProduct(){

        System.out.println("-------Below is the Actual Product details-------");
        System.out.println("Name of the Product: "+name);
        System.out.println("Category of the Product: "+category);
        System.out.println("Price of Product: "+price);
        System.out.println("Product Quantity: "+quantity);
        System.out.println("Product Production per day: "+production);
        int doit;
        do {
            System.out.println("What you want to update? Enter an option number from below\n 1. Name \n 2. Category \n 3. Price \n 4. Quantity \n 5. Production per day");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Name of the Product: ");
                    name = sc.nextLine();
                }
                case 2 -> {
                    System.out.print("Category of the Product: ");
                    category = sc.nextLine();
                }
                case 3 -> {
                    System.out.print("Price of Product: ");
                    price = sc.nextFloat();
                }
                case 4 -> {
                    System.out.print("Product Quantity: ");
                    quantity = sc.nextInt();
                    sc.nextLine();
                }
                case 5 -> {
                    System.out.print("Product Production per day: ");
                    production = sc.nextInt();
                    sc.nextLine();
                }
                default -> System.out.println("Please select valid option. Choose only specified option number");
            }
            if(choice>5 || choice<1){
                doit =1;
                continue;
            }
            System.out.println();
            System.out.println("Do you want to update other details? (1.Yes / 2. No)");
            doit=sc.nextInt();
            while(!(doit==1 || doit==2)){
                System.out.println("Not a valid option. Enter 1 for yes and 2 for no");
                doit = sc.nextInt();
            }

        }while (doit==1);
        return true;
    }

    public void displayProduct(){
        System.out.println(name+" "+price+" "+" "+quantity+" "+category+" "+production);
    }

}
