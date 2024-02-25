package com.teachMeskills.lesson15.hw.task2.figure.implement;

import com.teachMeskills.lesson15.hw.task2.figure.BaseFigure;

public class Triangle extends BaseFigure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (isTriangleExist(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException(String.format("Triangle with with sides '%f' & '%f' & '%f' does not exist!", sideA, sideB, sideC));
        }
    }

    @Override
    public double getPerimeter() {
        perimeter = sideA + sideB + sideC;
        System.out.printf("Perimeter of triangle with sides '%f' & '%f' & '%f' is: '%f'", sideA, sideB, sideC, perimeter);
        System.out.println();
        return perimeter;
    }

    private boolean isTriangleExist(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

}
