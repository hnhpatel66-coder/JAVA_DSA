import java.util.Scanner;

public class nested_ifelse {


        public static void main(){
            Scanner Marks = new Scanner(System.in);

            System.out.println("Enter Marks of Maths: ");
            float Maths = Marks.nextFloat();

            System.out.println("Enter Marks of Chemistry: ");
            float Chem = Marks.nextFloat();

            System.out.println("Enter Marks of Physics: ");
            float Ph = Marks.nextFloat();

            float percentage = (Maths+Chem+Ph)/3;
            System.out.println("Percentage is: "+percentage+"%");

            if(percentage>=33 &&  percentage<=100){
                System.out.println("PASS ");
                if(percentage<=100 && percentage>90){
                    System.out.println("A+ GRADE");
                }
                else if(percentage<=90 && percentage>80){
                    System.out.println("A GRADE");
                }
                else if(percentage<=80 && percentage>=33){
                    System.out.println("B+ GRADE");
                }
            }
            else if(percentage<33 && percentage>=0){
                System.out.println("FAIL ");
            }
            else{
                System.out.println("INVALID MARKS ");

        }
    }

}
