package com.java.day3_assign;

import java.util.Scanner;

public class Day3_Assigment1 {
    public static void main(String[] args){
        int sub1, sub2, sub3, sub4, sub5;
        float percentage;
        int max = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        sub4 = sc.nextInt();
        sub5 = sc.nextInt();

        percentage = (float)(sub1+sub2+sub3+sub4+sub5)/(float)(5*max);
        percentage *=100;

        if(percentage>=85){
            System.out.println("Your Grade is '"+'A'+"' and percentage is "+ percentage);
        }
        else if(percentage>=75 && percentage<85){
            System.out.println("Your Grade is '"+'B'+"' and percentage is "+ percentage);
        }
        else if(percentage>=60 && percentage<75){
            System.out.println("Your Grade is '"+'C'+"' and percentage is "+ percentage);
        }
        else {
            System.out.println("Your Grade is '"+'D'+"' and percentage is "+ percentage);
        }

    }
}
