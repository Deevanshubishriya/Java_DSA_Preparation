package Questions_level02;
//Task: Take an integer input (e.g., 7) and print its multiplication table up to 10 (e.g., 7 x 1 = 7 ... 7 x 10 = 70).
public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= 10 ; i++) {
            int res = num * i;
            System.out.println(num + " *" + i + "= " +res);
        }
    }
}
