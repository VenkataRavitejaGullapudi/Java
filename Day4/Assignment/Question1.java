package com.java.day4_assign;

public class Question1 {
    public static void main(String[] args){
        int n=5;
        Avenger[] avengers = new Avenger[n];
        for(int i=0;i<n;i++){
            avengers[i] = new Avenger();
            avengers[i].getDetails();
        }
        System.out.println("----------------------- Entered details of Avengers -----------------------");
        for(int i=0;i<n;i++){
            System.out.println("----------------------- Avenger"+(i+1)+" -----------------------");
            avengers[i].displayDetails();
        }

    }
}
