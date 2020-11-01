package com.java.day4;

public class Main {
    public static void main(String[] args){
        // Array of the integers
        int[] numbers = new int[3];
        // Array of Objects which are Employee type
        Employee[] employees = new Employee[3];

        // Object Creation and storing in array
        for(int i=0;i<3;i++){
            employees[i] = new Employee();
        }

        //set details
        for(int i = 0;i<3;i++){
            employees[i].getData();
        }

        //get details
        //set details
        for(int i = 0;i<3;i++){
            employees[i].display();
        }

    }
}
