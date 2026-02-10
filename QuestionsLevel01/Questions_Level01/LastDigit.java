package Questions_Level01;
//Write a program that takes an integer as input and prints its last digit. (Hint: Use the modulo operator %).
public class LastDigit {
    public static void main(String[] args) {
        int a = 145;
        a = a % 10;
        System.out.println(a);
    }
}
