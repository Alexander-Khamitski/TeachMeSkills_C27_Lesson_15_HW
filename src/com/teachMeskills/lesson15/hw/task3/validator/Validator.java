package com.teachMeskills.lesson15.hw.task3.validator;

import com.teachMeskills.lesson15.hw.task3.consts.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isStringMatchesPattern(String str) {
        Pattern p = Pattern.compile(Constants.INTEGER_REGEX);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean isValueWithinIntegerRange(String str) throws NumberFormatException {
        Integer.parseInt(str);
        return true;
    }
}
