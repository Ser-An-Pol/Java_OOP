import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.getFirstName() + " " + o1.getLastName();
        String s2 = o2.getFirstName() + " " + o2.getLastName();

        return s1.compareTo(s2);
    }
}
