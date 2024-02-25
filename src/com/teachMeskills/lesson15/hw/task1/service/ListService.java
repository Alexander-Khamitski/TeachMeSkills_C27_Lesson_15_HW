package com.teachMeskills.lesson15.hw.task1.service;

import com.teachMeskills.lesson15.hw.task1.validator.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListService {

    public static List<Integer> getFilledList(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            String value = UserRequestService.getValueFromUser(scanner);
            if (value.equals("exit")) {
                flag = false;
            } else if (isStringValid(value)) {
                int i = Integer.parseInt(value);
                list.add(i);
            } else {
                System.out.println(String.format("Invalid value: '%s'.", value));
            }
        }
        return list;
    }

    public static void printEvenElementsFromList(List<Integer> list) {
        System.out.print("\nAll even elements from list are: ");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    private static boolean isStringValid(String str) {
        try {
            return Validator.isStringMatchesPattern(str) && Validator.isValueWithinIntegerRange(str);
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
