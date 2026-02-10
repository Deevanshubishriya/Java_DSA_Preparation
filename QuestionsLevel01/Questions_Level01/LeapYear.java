package Questions_Level01;

import java.util.Scanner;

//Leap Year Validator: Write a program to check if a year is a leap year. (Rules: Divisible by 4, but not by 100 unless also divisible by 400).
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        if ((year%4==0)&& (year%400==0) || (year%100==0)){
            System.out.println("its a leap year");
        }
        else {
            System.out.println("its not a leap year");
        }
        sc.close();
    }
}
