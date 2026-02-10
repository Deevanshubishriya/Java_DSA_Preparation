package Questions_Level01;
//Valid Triangle (Angles): Write a program that asks for three angles and checks if they form a valid triangle (Sum must be 180 and no angle can be 0).
public class AngleCheck {
    public static void main(String[] args) {
        int a = 60;
        int b = 80;
        int c = 40;
        int sum = a +b+c;
        if (sum== 180){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("not valid");
        }
    }
}
