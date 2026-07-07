import java.util.Collections;

public class AgeComparetorv implements AgeComparator<student> {
    @Override
    public int compare(student s1, student s2) {
        return s1.Age-s2.Age;
    }

}
