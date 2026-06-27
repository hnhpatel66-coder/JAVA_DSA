abstract class Bird {
    abstract void fly();

    abstract void eat();

    void sleep() {
        System.out.println("Birds sleep");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eats seeds");
    }
}
class Crow extends Bird {
    @Override
    void fly() {
        System.out.println("Crow can fly");
    }

    @Override
    void eat() {
        System.out.println("Crow eats seeds");
    }
}

public class Abstrac_Class {

    public static void DoBird(Bird b) {
        b.fly();
        b.eat();
        b.sleep();
    }

    public static void main(String[] args) {
        System.out.println("##########Abstract Class using Polymorphism: ");

        DoBird(new Sparrow());
        DoBird(new Crow());


        // System.out.println("##########Abstract Class: ");
        // Bird b = new Sparrow();
        // b.fly();
        // b.eat();
        
        // System.out.println("");
        // b = new Crow();
        // b.fly(); 
        // b.eat();
    }
}

