package Questions_level02;
//Task: Create a loop that prints numbers from 1 to 100. If the number is 50, print "Target Found" and immediately stop the loop using the break keyword. Ensure no numbers after 50 are printed.
public class BreakSearch {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] == 50) {
                System.out.println("target found ");
                break;

            }
            System.out.println(arr[i]);
        }
    }

}
