import java.util.*;

class student{
    public String Name;
    public int RollNo;
    public int Weight;

    public student(String Name, int RollNo, int Weight){
        this.Name = Name;
        this.RollNo = RollNo;
        this.Weight = Weight;
    }

    public String getName(String Name){
        return Name;
    }

    public int getRollNo(int RollNo){
        return RollNo;
    }

    public int getWeight(int Weight){
        return Weight;
    }

    @Override
    public String toString() {
        return "student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                ", Weight=" + Weight +
                '}';
    }

}


public class Student_2 {
    public static void main(String[] args) {
       List<student> student = new ArrayList<>();

        student.add(new student("Nirbhay", 1, 81));
        student.add(new student("Mihir", 2, 83));
        student.add(new student("Nruty", 3, 91));

        System.out.println("List of Students: " + student);
    }
}
