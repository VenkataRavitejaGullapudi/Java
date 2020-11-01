package com.java.day8;

public class Square implements Shape {
    private float side=4f;

    // Annotation that it will override method in parent
    @Override
    public void area() {
        float area = side*side;
        System.out.println(area);
    }
}
