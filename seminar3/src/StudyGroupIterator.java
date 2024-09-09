import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    private int index;
    private List<Student> studentList;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.index = 0;
        this.studentList = studyGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if (this.hasNext()) return studentList.get(index++);
        else return null;
    }

    @Override
    public void remove() {
        this.studentList.remove(index);
    }
}
