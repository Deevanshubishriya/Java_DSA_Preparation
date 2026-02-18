package Question_Level03;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclasses
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}
public class Inheritance_Animal {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        // Calling the sounds using a loop
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
