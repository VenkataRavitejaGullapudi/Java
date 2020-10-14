package com.java.day4_assign;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("--------------------Program to sum all the elements in an array----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values you wanted to put into an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Sum of numbers in your array is: ");
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
