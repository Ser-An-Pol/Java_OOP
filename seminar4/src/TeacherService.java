import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService extends GroupService<Teacher>{


    public TeacherService(Group<Teacher> group) {
        super(group);
    }

    public List<Teacher> sortStudentsBySubject() {
        List<Teacher> teachers = new ArrayList<>(group.getMembers());
        Collections.sort(teachers);
        return teachers;
    }
}
