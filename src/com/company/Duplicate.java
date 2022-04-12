package com.company;import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicate  {

    public static void main(String[] args) {

        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        System.out.println("No of Strings : ");
        int numSentences = Integer.parseInt(in.nextLine());

        System.out.println("Enter String : ");

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            System.out.println(input);
        }

        in.close();
    }
}


