package com.teachmeskills.lesson_7.Ex_2;

public class Circle extends Figure{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateThePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateTheArea() {
        return Math.PI * radius * radius;
    }
}
