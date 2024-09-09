import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;
    private int numberOfGroup;

    public StudyGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "numberOfGroup=" + numberOfGroup +
                ", CountOfStudents =" + studentList.size() +
                "}\n";
    }
}
