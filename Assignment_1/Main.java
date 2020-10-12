package com.java.ravi;

public class Main {

    public static void main(String[] args) {
	    //Object creation
        Employee e1 = new Employee();
        e1.setData("Some 1st name",21,"Some city 1");

        Employee e2 = new Employee();
        e2.setData("Some Other name",22,"Some other city");
        System.out.println("############First employee Details:###########");
        e1.display();
        System.out.println("############Second employee Details:##########");
        e2.display();
    }
}
