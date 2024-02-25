package com.teachMeskills.lesson15.hw.task2.run;

import com.teachMeskills.lesson15.hw.task2.figure.BaseFigure;
import com.teachMeskills.lesson15.hw.task2.service.FigureService;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<BaseFigure> figures = FigureService.getFiguresList();
        FigureService.getFigurePerimeters(figures);
    }

}
