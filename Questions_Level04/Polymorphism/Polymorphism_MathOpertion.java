package Questions_Level04.Polymorphism;
//Question 1: Compile-Time Polymorphism (Method Overloading)
//Write a Java program that creates a MathOperations class. Overload a method named multiply to handle the following scenarios:
//
//Multiply two integers.
//
//Multiply three integers.
//
//Multiply two double values.
//Task: In your main method, call each of these overloaded methods and print their results to demonstrate compile-time polymorphism.
public class Polymorphism_MathOpertion {
    public int multiply(int a , int b){
        return a*b;
    }
    public int multiply(int a, int b , int c){
        return a*b*c;
    }
    public double multiply(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        Polymorphism_MathOpertion numbers = new Polymorphism_MathOpertion();

        System.out.println(numbers.multiply(2,4));

        System.out.println(numbers.multiply(2,4,6));

        System.out.println(numbers.multiply(2.5,6.7));
    }
}
