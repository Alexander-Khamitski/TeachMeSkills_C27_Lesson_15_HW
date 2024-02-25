package com.teachMeskills.lesson15.hw.task1.run;

import com.teachMeskills.lesson15.hw.task1.service.ListService;

import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = ListService.getFilledList(scanner);
        scanner.close();
        ListService.printEvenElementsFromList(list);
    }

}
