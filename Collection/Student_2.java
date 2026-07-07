import java.util.*;

class student implements Comparable<student> {
    public String Name;
    public int Age;
    public int Weight;

    public student(String Name, int Age, int Weight){
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
    }

    public String getName(String Name){
        return Name;
    }

    public int getAge(int Age){
        return Age;
    }

    public int getWeight(int Weight){
        return Weight;
    }

    @Override
    public String toString() {
        return "student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                '}';
    }

    @Override
    public int compareTo(student that) {
        if (this.Age == that.Age) {
            return this.Name.compareTo(that.Name);
        }
        return this.Age-that.Age;

    }
}


public class Student_2 {
    public static void main(String[] args) {
       List<student> student = new ArrayList<>();

        student.add(new student("Nirbhay", 19, 81));
        student.add(new student("Mihir", 20, 83));
        student.add(new student("Nruty", 21, 91));

        System.out.println("List of Students: " + student);

        //Collections.sort(student);
    
        // Collections.sort(student, new Comparator<student>() {
        //     public int compare(student s1, student s2) {
        //         return s1.Age-s2.Age;
        //     }
        // });

        //lambda expression
        Collections.sort(student, (s1, s2) -> s1.Age-s2.Age);

       // Collections.sort(student, new AgeComparetor());
        System.out.println("List of Students after sorting: " + student);

    }
}
