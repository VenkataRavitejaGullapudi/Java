package com.java.ProductManagementSystem;

import java.util.Scanner;

public class Management {
    int max = 5;
    Scanner sc = new Scanner(System.in);
    Product[] products = new Product[max];

    int noofproducts=0;
    int count=0;
    Management(){
        for(int i=0;i< products.length;i++){
            products[i]= new Product();
        }
    }

    public void addProduct(){
        int choice;
        do{
            products[noofproducts].createProduct();
            noofproducts++;
            count++;
            System.out.println("Do you want to add another?\n 1.Yes \n 2. No");
            choice=sc.nextInt();
        }while(choice==1);

    }

    public void deleteProduct() {
        displayProducts();
        System.out.println();
        if (count != 0) {
            System.out.println("How you wanted to delete??? \n 1. Delete by product name \n 2. Delete by Product number");
            int option_sel = sc.nextInt();
            sc.nextLine();
            if (option_sel == 1) {
                System.out.println("Enter the name of product you wanted to delete: ");
                String name = sc.nextLine();
                boolean exist =false;
                for (int i = 0; i < noofproducts; i++) {
                    if (products[i].getName().equals(name)) {
                        products[i].setDeleted(true);
                        exist = true;
                        System.out.println("Product "+products[i].getName()+" deleted successfully");
                    }
                }
                if(!exist){
                    System.out.println("Sorry!! Entered name not matched with any of the products.. Try Again!!");
                    deleteProduct();
                }
            }
            else{
                System.out.println("Enter the product number you wanted to delete: ");
                int number = sc.nextInt();
                boolean exist =false;
                for (int i = 0; i < noofproducts; i++) {
                    if (i + 1 == number) {
                        products[i].setDeleted(true);
                        exist = true;
                        System.out.println("Product "+products[i].getName()+" deleted successfully");
                    }
                }
                if(!exist){
                    System.out.println("Sorry!! Entered name not matched with any of the products.. Try Again!!");
                    deleteProduct();
                }

            }
        }
        else {
            System.out.println("You have no products!! Lets add one..");
        }
    }
    public void updateProduct() {
        displayProducts();
        System.out.println();
        if (count != 0) {
            System.out.println("How you want to update??? \n 1. Update by product name \n 2. Update by Product number");
            int option_sel = sc.nextInt();
            sc.nextLine();
            if (option_sel == 1) {
                System.out.println("Enter the name of product you wanted to Update: ");
                String name = sc.nextLine();
                boolean exist =false;
                for (int i = 0; i < noofproducts; i++) {
                    if (products[i].getName().equals(name)) {
                        exist = products[i].updateProduct();
                        if(exist)
                            System.out.println("Product "+products[i].getName()+" updated successfully");
                        System.out.println();
                    }
                }
                if(!exist){
                    System.out.println("Sorry!! Entered name not matched with any of the products.. Try Again!!");
                    System.out.println();
                    updateProduct();
                }
            }
            else{
                System.out.println("Enter the product number you wanted to update: ");
                int number = sc.nextInt();
                boolean exist =false;
                for (int i = 0; i < noofproducts; i++) {
                    if (i + 1 == number) {
                        exist = products[i].updateProduct();
                        if(exist)
                            System.out.println("Product "+products[i].getName()+" updated successfully");
                    }
                }
                if(!exist){
                    System.out.println("Sorry!! Entered name not matched with any of the products.. Try Again!!");
                    updateProduct();
                }

            }
        }
        else {
            System.out.println("You have no products!! Lets add one..");
        }
    }


    public void displayProducts(){
        System.out.println("-----Below are the products added----");
        if(count!=0) {
            for (int i = 0; i < noofproducts; i++) {
                if(!products[i].isDeleted()) {
                    System.out.print(i + 1 + ". ");
                    products[i].displayProduct();
                }
            }
        }
        else {
            System.out.println("You have no products!! Lets add one..");
        }
    }

    public void sortbyPriceAndDisplay(){
        Product tempProduct;
        if(count!=0) {
            for (int i = 0; i < noofproducts; i++) {
                for (int j = i + 1; j < noofproducts; j++) {
                    if (products[i].getPrice() < products[j].getPrice()) {
                        tempProduct = products[i];
                        products[i] = products[j];
                        products[j] = tempProduct;
                    }
                }
            }
            for (int i=0;i<noofproducts;i++){
                if(!products[i].isDeleted())
                    products[i].displayProduct();
            }
        }
        else {
            System.out.println("You have no products!! Lets add one..");
        }
    }

}
