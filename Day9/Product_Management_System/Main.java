package com.java.ProductManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        int doit;
        Management management = new Management();

        do {
            System.out.println("Choose an option");
            System.out.println("1. Add Products");
            System.out.println("2. View Products");
            System.out.println("3. Sort by Price");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product Details");
            System.out.println();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> management.addProduct();
                case 2 -> management.displayProducts();
                case 3 -> management.sortbyPriceAndDisplay();
                case 4 -> management.deleteProduct();
                case 5 -> management.updateProduct();
                default -> System.out.println("Please select valid option. Choose only specified option number");
            }
            if(choice>5 || choice<1){
                doit =1;
                continue;
            }
            System.out.println();
            System.out.println("Do you want to continue to Main Menu? (1.Yes / 2. No)");
            doit=sc.nextInt();
            while(!(doit==1 || doit==2)){
                System.out.println("Not a valid option. Enter 1 for yes and 2 for no");
                doit = sc.nextInt();
            }

        }while (doit==1);
    }
}
