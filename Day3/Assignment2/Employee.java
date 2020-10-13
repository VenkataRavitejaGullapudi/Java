package com.java.day3_assign;
import java.time.LocalDate;

public class Employee {
    String name;
    int date;
    int month;
    int year;
    float month_salary;
    float year_sal;

    public void setData(String inp_name,int inp_date,int inp_month, int inp_year, float inp_month_sal)
    {
        name = inp_name;
        date = inp_date;
        month = inp_month;
        year = inp_year;
        month_salary = inp_month_sal;
        year_sal = month_salary*12;

    }
    public int calculateAge(){
        int dif_date,dif_month,dif_year;
        int cur_date = LocalDate.now().getDayOfMonth();
        int cur_month = LocalDate.now().getMonthValue();
        int cur_year = LocalDate.now().getYear();
        int age;
        if(date>=cur_date)
            dif_date = date-cur_date;
        else
            dif_date = cur_date-date;

        if(month>=cur_month)
            dif_month = month-cur_month;
        else
            dif_month = cur_month-month;

        if(year>=cur_year)
            dif_year = year-cur_year;
        else
            dif_year = cur_year-year;

        if(cur_month==month){
            if(cur_date<date){
                age = dif_year-1;
            }
            else{
                age = dif_year;
            }
        }
        else if(cur_month<month){
            age = dif_year-1;
        }
        else{
            age = dif_year;
        }

        return age;
    }
    public void calculateTax()
    {
        if(year_sal>500000){
            float tax = (year_sal*20)/100;
            System.out.print("20% of Tax should be paid, i.e., "+ tax + "rupees");
        }

        else if(year_sal>400000 && year_sal<=500000){
            float tax = (year_sal*15)/100;
            System.out.print("15% of Tax should be paid, i.e., "+ tax + "rupees");
        }

        else if(year_sal>300000 && year_sal<=400000){
            float tax = (year_sal*10)/100;
            System.out.print("10% of Tax should be paid, i.e., "+ tax + "rupees");
        }

        else if(year_sal>200000 && year_sal<=300000){
            float tax = (year_sal*5)/100;
            System.out.print("5% of Tax should be paid, i.e., "+ tax + "rupees");
        }
        else{
            System.out.print("No tax needed to pay");
        }

    }

}
