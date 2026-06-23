import java.util.Scanner;

public class Method_Overloding {

    static int add(int a,int b){
        return a+b;
    }

    static float add(float a,float b, float c){
        return a+b+c;
    }
    public static void main() {

        int ans1 = add(3, 9);
        float ans2 = add(3.33f, 5.11f, 11.33f);
        System.out.println("ans1 : " + ans1);
        System.out.println("ans2 : "+ ans2);

    }
}
