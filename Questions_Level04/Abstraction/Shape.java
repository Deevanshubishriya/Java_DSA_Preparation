package Questions_Level04.Abstraction;
//Question 3: Abstract Classes and Concrete Methods
//Create an abstract class Shape with an abstract method calculateArea() and a concrete method displayShape() that prints "This is a geometric shape".
//Create two concrete subclasses:
//
//Circle (with a radius attribute).
//
//Rectangle (with length and width attributes).
//Task: Implement the calculateArea() method in both subclasses. In the main method, create references of Shape for both Circle and Rectangle. Call both displayShape() and calculateArea() using these references.
// Abstract Class
abstract class Shape {
    // Abstract method (no body)
    abstract void calculateArea();

    // Concrete method (has a body)
    void displayShape() {
        System.out.println("This is a geometric shape");
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main Class

