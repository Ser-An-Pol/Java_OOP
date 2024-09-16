import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService extends GroupService<Student>{


    public StudentGroupService(Group<Student> group) {
        super(group);
    }

    public List<Student> sortStudentsByAge() {
        List<Student> studentList = new ArrayList<>(group.getMembers());
        Collections.sort(studentList);
        return studentList;
    }
}
