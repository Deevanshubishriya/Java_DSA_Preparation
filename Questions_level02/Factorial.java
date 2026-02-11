package Questions_level02;

import java.util.Scanner;

//Task: Calculate the factorial of a number n (e.g., 5! = 5*4*3*2*1 = 120).
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no,");
        int fact = sc.nextInt();
        int i = 1;
        while(fact > 0){
            i = i * fact;
            fact--;
        }
        System.out.println(i);
        sc.close();
    }

}
