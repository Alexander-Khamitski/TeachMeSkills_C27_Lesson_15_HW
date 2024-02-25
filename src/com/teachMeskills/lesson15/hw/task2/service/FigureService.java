package com.teachMeskills.lesson15.hw.task2.service;

import com.teachMeskills.lesson15.hw.task2.figure.BaseFigure;
import com.teachMeskills.lesson15.hw.task2.figure.implement.Circle;
import com.teachMeskills.lesson15.hw.task2.figure.implement.Rectangle;
import com.teachMeskills.lesson15.hw.task2.figure.implement.Triangle;

import java.util.Arrays;
import java.util.List;

public class FigureService {

    public static List<BaseFigure> getFiguresList() {
        BaseFigure triangle1 = new Triangle(3, 4, 5);
        BaseFigure triangle2 = new Triangle(3, 6, 5);
        BaseFigure rectangle = new Rectangle(4, 7);
        BaseFigure circle1 = new Circle(3);
        BaseFigure circle2 = new Circle(4);
        return Arrays.asList(triangle1, triangle2, rectangle, circle1, circle2);
    }

    public static void getFigurePerimeters(List<BaseFigure> figures) {
        for (BaseFigure figure : figures) {
            figure.getPerimeter();
        }
    }
}
