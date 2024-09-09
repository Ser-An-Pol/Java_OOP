import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudyGroupService {

    private StudyGroup studyGroup;

    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public boolean removeStudent(String firstName, String secondName, String lastName) {

        for (Student stud : studyGroup) {
            if (stud.getFirstName().equals(firstName) &&
                stud.getSecondName().equals(secondName) &&
                stud.getLastName().equals(lastName)) {
                studyGroup.getStudentList().remove(stud);
                return true;
            }
        }
        return false;
    }

//    public void sortStudentsByID() {
//        Collections.sort(studyGroup.getStudentList());
//    }

    public List<Student>  sortStudentsByAge() {
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student>  sortStudentsByFirstLastName() {
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
