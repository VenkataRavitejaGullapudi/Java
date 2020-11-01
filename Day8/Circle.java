package com.java.day8;

public class Circle implements Shape {
    float radius=4f;
    public void area() {
        float area =pi*radius*radius;
        System.out.println(area);
    }
}
