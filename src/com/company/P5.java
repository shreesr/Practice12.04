package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P5 {

    String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
     Pattern P= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No of String : ");
        int num = Integer.parseInt(sc.nextLine());
    }
}
