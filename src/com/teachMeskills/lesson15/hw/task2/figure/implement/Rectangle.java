package com.teachMeskills.lesson15.hw.task2.figure.implement;

import com.teachMeskills.lesson15.hw.task2.figure.BaseFigure;

public final class Rectangle extends BaseFigure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        if (isRectangleExist(sideA, sideB)) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            throw new IllegalArgumentException(String.format("Rectangle with with sides '%f' & '%f' does not exist!", sideA, sideB));
        }
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (sideA + sideB);
        System.out.printf("Perimeter of rectangle with sides '%f' & '%f' is: '%f'", sideA, sideB, perimeter);
        System.out.println();
        return perimeter;
    }

    private boolean isRectangleExist(double sideA, double sideB) {
        return sideA >= 0 && sideB >= 0;
    }
}
