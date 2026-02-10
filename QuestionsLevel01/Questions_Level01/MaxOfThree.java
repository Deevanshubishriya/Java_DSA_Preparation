package Questions_Level01;
//Max of Three: Write a program to find the maximum of three numbers entered by the user.
public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("a is maximum");
        } else if (b > a && b > c) {
            System.out.println("b is maximum");

        }
        else {
            System.out.println("c is maximum");
        }
    }
}
