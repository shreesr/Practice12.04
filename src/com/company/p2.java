package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2 {
    public static void main(String[] args) {

        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
      Pattern P= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

      Scanner in =new Scanner(System.in);
        System.out.println("Enter No of Strings : ");
        int Num =Integer.parseInt(in.nextLine());

        while(Num-- > 0){

            System.out.println("Enter a String : ");

            String input = in.nextLine();
            Matcher m = P.matcher(input);

            while (m.find()){

                input = input.replaceAll(m.group(),m.group(1));

            }
            System.out.println(input);

        }
        in.close();

    }
}

