interface Bird {
    void fly();

    void eat();

    default void sleep() {
        System.out.println("Birds sleep");
    }

}


class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats seeds");
    }

}

class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow can fly");
    }

    @Override
    public void eat() {
        System.out.println("Crow eats seeds");
    }

}


public class Interface_AbstracClass {

    public static void DoBird(Bird b) {
        b.fly();
        b.eat();
        b.sleep();
    }

        public static void main(String[] args) {
        System.out.println("***********Interface using Polymorphism: ************");

        DoBird(new Sparrow());
        DoBird(new Crow());

    }
}
