package com.company;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P4 {

    public static void main(String[] args) {

        String pattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern P = Pattern.compile(pattern);

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no of Strings : ");
        int testcase = Integer.parseInt(sc.nextLine());

        while (testcase > 0){
            System.out.println("Enter String : ");
            String line = sc.nextLine();

            Matcher m= P.matcher(line);
            boolean findmatch= true;
            while (m.find( )){
                System.out.println(m.group(2));
                findmatch = false;
            }
            if (findmatch)
                System.out.println("None");
        }
        testcase--;


        sc.close();

    }

    }
//    <h1>Nayeem loves counseling</h1>
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>