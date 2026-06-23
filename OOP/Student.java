import java.util.Scanner;

class student {
    private String name;
    private int rollNumber;
    private float marks;


    public student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.print("Enter Marks: ");
    
        for(int i=0 ; i<3 ; i++){
            marks = sc.nextFloat();
        }
    }
    public void display() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        
        for(int i=0 ; i<3 ; i++){
            System.out.println("Marks: " + marks);
        }
    }
        
    }

    public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        student A = new student("Nirbhay", 101, 85.5f);

        int choice;
        do {
            System.out.println("---------------- STUDENT MENU ----------------");
            System.out.println("1. Input Details");
            System.out.println("2. Display Details");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    A.inputDetails();
                    break;

                case 2:
                    A.display();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 3);
    }
}