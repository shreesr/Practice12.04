package com.company;
import java.util.*;
import java.util.regex.*;

public class Tagbase {
    public static void main(String[] args){


        String pattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern r = Pattern.compile(pattern);


        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of Testcases : ");
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            System.out.println("Enter Testcase : ");
            String line = in.nextLine();


            Matcher m = r.matcher(line);
            boolean findMatch = true;
            while(m.find( )){
                System.out.println(m.group(2));
                findMatch = false;
            }
            if(findMatch) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}



