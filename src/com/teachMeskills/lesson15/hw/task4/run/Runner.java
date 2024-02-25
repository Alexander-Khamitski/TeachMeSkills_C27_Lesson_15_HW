package com.teachMeskills.lesson15.hw.task4.run;

import com.teachMeskills.lesson15.hw.task4.consts.C27onlGroup;
import com.teachMeskills.lesson15.hw.task4.service.SetService;

import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        List<String> list = C27onlGroup.C27_ONL_GROUP;
        Set<String> set = SetService.getSetFromList(list);
        SetService.printSet(set);
    }

}
