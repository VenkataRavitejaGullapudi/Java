package com.java.quizapplication;

import java.util.Scanner;

public class Player {
    Scanner sc =new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){
        System.out.print("Enter Player Name: ");
        name = sc.next();
    }
}
