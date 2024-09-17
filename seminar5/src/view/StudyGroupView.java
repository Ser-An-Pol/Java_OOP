package view;

import model.Student;
import model.StudyGroup;

public class StudyGroupView {
    public void sendOnConsole(StudyGroup studyGroup) {
        System.out.println("---------------------------");
        System.out.println(studyGroup);
        System.out.println("--------Students-----------");
        for (Student student : studyGroup.getStudentList()) {
            System.out.println(student);
        }
        System.out.println("---------------------------");
    }
}
