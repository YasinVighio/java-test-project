package com.test.project;

import org.apache.commons.lang.StringUtils;

public class HelloClass {

    public static void main(String[] args) {
        System.out.println(firstLetterCapital("test"));
    }
    public static String firstLetterCapital(String s){
        return StringUtils.capitalize(s);
    }
}
