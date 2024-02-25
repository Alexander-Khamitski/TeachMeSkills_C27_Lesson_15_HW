package com.teachMeskills.lesson15.hw.task3.run;

import com.teachMeskills.lesson15.hw.task3.service.ListService;

import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listSize = ListService.getListSize(scanner);
        scanner.close();
        List<Integer> list = ListService.fillListByRandomValues(listSize);
        ListService.printElementsFromList(list);
        ListService.getListAverage(list);
    }

}
