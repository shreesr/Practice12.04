package com.company;

import java.util.Locale;
import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String A=scanner.nextLine();
        System.out.println("Enter String 2 :");
        String B =scanner.nextLine();

        System.out.println(A.length()+B.length());

        System.out.println((A.compareTo(B)> 0 ) ? "Yes" : "No");

        System.out.println(
                A.substring(0,1).toUpperCase() + A.substring(1) + " " +
                B.substring(0,1).toUpperCase() + B.substring(1)
        );
    }
}
