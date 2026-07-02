import java.util.*;

class student{
    public int rollno;
    public String name;

    public student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        student student = (student) obj;
        return rollno == student.rollno; //&& Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() { 
        return Objects.hash(rollno); //return Objects.hash(rollno, name);
    }

}

public class Student_1 {
    public static void main(String[] args) {
        HashSet<student> set = new HashSet<>();

        student s1 = new student(1, "Nirbhay");
        student s2 = new student(1, "Nirbhay");
        student s3 = new student(2, "Nirbhay");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("Set: " + set);
    }

    
}