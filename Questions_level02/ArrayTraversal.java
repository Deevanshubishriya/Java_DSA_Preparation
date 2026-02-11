package Questions_level02;
//Task: Create an integer array of size 5 containing the values {10, 20, 30, 40, 50}. Print every element using the Enhanced For-Loop (for-each).
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Printing elements using Enhanced For-Loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
