package Questions_Level04.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Using Shape references for polymorphic behavior
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(4.0, 6.0);

        // Accessing Circle methods
        myCircle.displayShape();
        myCircle.calculateArea();

        System.out.println("---------------------------");

        // Accessing Rectangle methods
        myRectangle.displayShape();
        myRectangle.calculateArea();
    }
}
