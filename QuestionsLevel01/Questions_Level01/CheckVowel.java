package Questions_Level01;

import java.util.Scanner;

//Vowel or Consonant: Write a program that checks if a character is a vowel or consonant using
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char lowerCh = Character.toLowerCase(ch);

        boolean isLetter = (lowerCh >= 'a' && lowerCh <= 'z');

        if (isLetter) {
            switch (lowerCh) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a Vowel.");
                    break;

                //  The Default Case (Everything else that is a letter)
                default:
                    System.out.println(ch + " is a Consonant.");
                    break;
            }
        } else {
            System.out.println("Error: " + ch + " is not an Alphabet!");
        }

        sc.close();
    }
}
