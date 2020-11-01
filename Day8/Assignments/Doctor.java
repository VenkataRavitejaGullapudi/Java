package com.java.day8_assign;

public class Doctor extends  Employee{
    public void checkPatient(){
        System.out.println("Patient Health is Checked");
    }
    public void writePrescription(){
        System.out.println("Written medicines and injection required for patient");
    }
    public void performSurgery(){
        System.out.println("Performing Surgery for patient");
    }
}
