class Shape{

    public void Draw(){
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape{
    @Override
    public void Draw(){
        System.out.println("Draw Circle");
    }
}

class Rectangle extends Shape{
    @Override
    public void Draw(){
        System.out.println("Draw Rectangle");
    }
}


public class RunTimePolymorephism_Overiding {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.Draw();

        System.out.println("Run Time Polymorephism (Late Binding) Upcasting: ");
        DoDrwing(s);
        DoDrwing(new Shape());
        
        s = new Rectangle();
        s.Draw();
    }

    public static void DoDrwing(Shape s){
        s.Draw();
    }
}
