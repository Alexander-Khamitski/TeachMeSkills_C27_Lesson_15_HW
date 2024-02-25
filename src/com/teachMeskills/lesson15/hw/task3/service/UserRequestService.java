package com.teachMeskills.lesson15.hw.task3.service;

import java.util.Scanner;

public class UserRequestService {

    public static String getListSize(Scanner scanner) {
        System.out.println("Enter list size: ");
        String value = scanner.nextLine();
        return value;
    }

}
