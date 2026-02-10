package Questions_Level01;

import java.util.Scanner;

//Character Checker: Write a program to check whether a given character is an Alphabet, a Digit, or a Special Character.
public class CharacterChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        // Java Scanner doesn't have nextChar(), so we take the first letter of the string
        char ch = sc.next().charAt(0);

        // 1. Check for Alphabets (Uppercase OR Lowercase)
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        }
        // 2. Check for Digits
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        }
        // 3. If it's neither, it must be a Special Character
        else {
            System.out.println(ch + " is a Special Character.");
        }

        sc.close();
    }
}




