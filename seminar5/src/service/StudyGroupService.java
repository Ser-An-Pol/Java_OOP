package service;

import model.StudyGroup;
import model.Teacher;
import model.Student;
import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> strudentList, int number) {
        return new StudyGroup(teacher, strudentList, number);
    }
}
