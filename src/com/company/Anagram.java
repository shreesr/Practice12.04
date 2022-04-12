package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
//        System.out.println("No of Strings : ");
//        int num =Integer.parseInt(sc.nextLine());

        System.out.println("Enter String :");
        String A= sc.nextLine();
        System.out.println("Enter String :");
        String B= sc.nextLine();

       String A1 = A.toLowerCase();
        String B1 = B.toLowerCase();


        if (A1.length() == B1.length()) {

            char[] cA1 =A1.toCharArray();
            char[] cA2 =B1.toCharArray();

            Arrays.sort(cA1);
            Arrays.sort(cA2);

            boolean result = Arrays.equals(cA1,cA2);

            if(result) {
                System.out.println(A + " and " + B + " are anagram.");
            }
            else {
                System.out.println(A + " and " + B + " are not anagram.");
            }
        }
    else {
            System.out.println(A + " and " + B + " are not anagram.");
        }
    }
}