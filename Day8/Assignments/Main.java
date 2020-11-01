package com.java.day8_assign;

public class Main {
    public static void main(String[] args) {
        int n=3;
        Doctor[] doctors = new Doctor[n];
        Engineer[] engineers = new Engineer[n];
        Pilot[] pilots = new Pilot[n];

        for(int i=0;i<n;i++){
            doctors[i] = new Doctor();
            System.out.println("--------------------- Enter Doctor-"+(i+1)+" details -------------------");
            doctors[i].getDetails();
        }
        for(int i=0;i<n;i++){
            System.out.println("--------------------- Enter Engineer-"+(i+1)+" details -------------------");
            engineers[i] = new Engineer();
            engineers[i].getDetails();
        }
        for(int i=0;i<n;i++){
            System.out.println("--------------------- Enter Pilot-"+(i+1)+" details -------------------");
            pilots[i] = new Pilot();
            pilots[i].getDetails();
        }
        System.out.println();
        System.out.println("+++++++++++++++ Details of Doctors +++++++++++");
        for(int i=0;i<n;i++){
            doctors[i].display();
        }
        System.out.println();
        System.out.println("%$%$%$%$%$%$%$%$% Details of Engineers $%$%$%$%$%$%$$%$%$%$%$");
        for(int i=0;i<n;i++){
            engineers[i].display();
        }
        System.out.println();
        System.out.println("////////////// Details of Pilots //////////////////");
        for(int i=0;i<n;i++){
            pilots[i].display();
        }
    }
}
