package com.company;
import java.util.Scanner;
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";

}


public class Validation {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no on Candidates : ");
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            System.out.println("Name of Candidate : ");
            String userName = scan.nextLine();

            if (userName.matches(UserValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

