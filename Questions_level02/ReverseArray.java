package Questions_level02;

import java.util.Arrays;

//Task: Write a program to reverse the elements of an array in-place.
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length -1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;

        }
        System.out.println(Arrays.toString(arr));
    }
}
