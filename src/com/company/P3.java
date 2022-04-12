package com.company;

import java.util.Scanner;

class UserValidator {
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";

}

public class P3 {
    private static final Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter No of Candidate : ");
        int n = Integer.parseInt(sc.nextLine());

        while(n-- != 0){

            System.out.println("Enter Name of Candidate : ");
            String userNAme= sc.nextLine();

            if (userNAme.matches(UserValidator.regularExpression)){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
}


    }
}
