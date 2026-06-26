class Shape{

    public void area(){
        System.out.println("Display Area");
    }
}

class Circle extends Shape{
    @Override
    public void area(){
        System.out.println("Display Area of Circle");
    }
}

class Rectangle extends Shape{
    @Override
    public void area(){
        System.out.println("Display Area of Rectangle");
    }
}


public class RunTimePolymorephism_Overiding {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
        
        s = new Rectangle();
        s.area();
    }
}
