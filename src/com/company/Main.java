package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String a=sc.nextLine();
        System.out.println("Enter String 1 : ");
        String b=sc.nextLine();


        System.out.println(a.length()+b.length());
        System.out.println((a.compareTo(b)> 0) ? "Yes" : "No");
        System.out.println(
                a.substring(0,1).toUpperCase() + a.substring(1) + " " +
                b.substring(0,1).toUpperCase() +b.substring(1)
        );
    }
}
