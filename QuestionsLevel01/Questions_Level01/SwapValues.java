package Questions_Level01;
//Write a program to swap two numbers without using a third variable
public class SwapValues {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("no. are swapped " + a + " "+ b);
    }
}
