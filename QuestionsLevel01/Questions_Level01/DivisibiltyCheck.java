package Questions_Level01;

import java.util.Scanner;

//Divisibility Check: Write a program to check whether a number is divisible by both 5 and 11.
public class DivisibiltyCheck {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = Sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("no. is divisible");
        }
        else {
            System.out.println("no. is not divisible");
        }
    }
}
