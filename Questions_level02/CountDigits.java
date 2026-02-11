package Questions_level02;

import java.util.Scanner;

//Task: Write a program that takes a number (e.g., 54321) and counts how many digits it has (Output: 5)
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        int count = 0 ;
        while (num > 0){
            num = num / 10;
            //num = num % 10;

            count++;
        }
        System.out.println(count);
    }
}
