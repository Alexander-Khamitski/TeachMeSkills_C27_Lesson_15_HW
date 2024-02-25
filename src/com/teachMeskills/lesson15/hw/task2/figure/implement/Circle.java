package com.teachMeskills.lesson15.hw.task2.figure.implement;

import com.teachMeskills.lesson15.hw.task2.figure.BaseFigure;

public final class Circle extends BaseFigure {

    double radius;

    public Circle(double radius) {
        if (isCircleExist(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException(String.format("Circle with with radius '%f' does not exist!", radius));
        }
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * 3.14 * radius;
        System.out.printf("Perimeter of circle with radius '%f' is: '%f'", radius, perimeter);
        System.out.println();
        return perimeter;
    }

    private boolean isCircleExist(double radius) {
        return radius > 0;
    }
}
