package Questions_Level01;
//Write a program to split a bill amount among 4 friends. If the bill is not perfectly divisible, show how much the extra amount is.
public class BillSpitter {
    public static void main(String[] args) {
        int amount = 5001;
        int friends = 4;
        int perfect = amount / friends;
        int extra = amount % friends;
        System.out.println("amount  = " + perfect + "and" + extra);

    }
}
