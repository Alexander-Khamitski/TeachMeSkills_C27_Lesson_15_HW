package com.teachMeskills.lesson15.hw.task4.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetService {

    public static Set<String> getSetFromList(List<String> list) {
        return new HashSet<>(list);
    }

    public static void printSet(Set<String> set) {
        String prefix = "All members in C27-onl group: ";
        StringBuilder sb = new StringBuilder(prefix);
        for (String studentName : set) {
            sb.append(studentName).append(", ");
        }
        String allMembersInC27onlGroup = sb.substring(0, sb.toString().length() - 1).concat(".");
        System.out.println(allMembersInC27onlGroup);
    }

}
