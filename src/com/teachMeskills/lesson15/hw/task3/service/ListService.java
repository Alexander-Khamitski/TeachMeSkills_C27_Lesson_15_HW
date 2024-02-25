package com.teachMeskills.lesson15.hw.task3.service;

import com.teachMeskills.lesson15.hw.task3.validator.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListService {

    public static Integer getListSize(Scanner scanner) {
        String str = UserRequestService.getListSize(scanner);
        if (isStringValid(str)) {
            return Integer.parseInt(str);
        } else {
            System.out.println(String.format("Invalid list size: '%s'.", str));
            return getListSize(scanner);
        }
    }

    public static List<Integer> fillListByRandomValues(int listSize) {
        List<Integer> list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            Random random = new Random();
            int value = random.nextInt(0, 10);
            list.add(value);
        }
        return list;
    }

    public static void printElementsFromList(List<Integer> list) {
        System.out.print("All elements from list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void getListAverage(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("List average: " + ((double) sum / (double) list.size()));

    }

    private static boolean isStringValid(String str) {
        try {
            return Validator.isStringMatchesPattern(str) && Validator.isValueWithinIntegerRange(str);
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
