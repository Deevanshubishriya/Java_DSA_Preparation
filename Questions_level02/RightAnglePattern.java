package Questions_level02;
//Task: Print the following pattern using nested for loops:
public class RightAnglePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }

    }
}
