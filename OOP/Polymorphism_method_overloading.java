class calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}



public class Polymorphism_method_overloading {
    public static void main(String[] args) {
    //   compile time polymorephism (early binding)
    //     System.out.println("Method Overloading");
    //     System.out.println("Method Overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different.");
    //     System.out.println("It is related to compile time polymorphism.");
    //     System.out.println("Method overloading can be achieved by changing the number of arguments or the type of arguments.");
    calculator c = new calculator();

        System.out.println("add(10, 20) = " + c.add(10, 20));
        System.out.println("add(10.5, 20.5, 33) = " + c.add(10.5, 20.5, 33));
        System.out.println("add(10, 20, 30) = " + c.add(10, 20, 30));
    }
}
