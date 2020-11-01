package com.java.day6;

import com.java.day4.Calculation;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        //e.age is not accessible as it is private

        // e.getData();

        // To set age we cant assign directly by calling age using object
        // so we can use setter method setAge
        e.setAge(20);

        // so to access the age we can use get method
        System.out.println(e.getAge());

        Calculation calculation = new Calculation();
        calculation.add(1,2);
        calculation.add(1,2,3);


    }
}
