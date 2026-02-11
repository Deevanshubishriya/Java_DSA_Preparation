package Questions_level02;
//Task: Given an array {2, 45, 12, -4, 99, 8}, write a program to find and print the largest number.
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2,45,12,-4,99,8};
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);

    }
}
