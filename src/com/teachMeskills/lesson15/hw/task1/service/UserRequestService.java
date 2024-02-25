package com.teachMeskills.lesson15.hw.task1.service;

import java.util.Scanner;

public class UserRequestService {

    public static String getValueFromUser(Scanner scanner) {
        System.out.println("Enter int value or 'exit': ");
        String value = scanner.nextLine();
        return value;
    }

}
