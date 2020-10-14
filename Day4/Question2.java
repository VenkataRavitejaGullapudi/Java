package com.java.day4_assign;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        System.out.println("---------------------Program to find odd elements in an array------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values you wanted to put into an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Odd numbers in your array are: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
