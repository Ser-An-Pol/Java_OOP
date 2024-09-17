package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public int createStudent(String lastName, String firstName, String secondName) {
        return dataService.creare(UserType.STUDENT, lastName, firstName, secondName);
    }

    public int createTeacher(String lastName, String firstName, String secondName) {
        return dataService.creare(UserType.TEACHER, lastName, firstName, secondName);
    }

    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        List<User> userList = dataService.getUserList();
        for (User user : userList) {
            if (user instanceof Student) studentList.add((Student)user);
        }
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        List<Teacher> teacherList = new ArrayList<>();
        List<User> userList = dataService.getUserList();
        for (User user : userList) {
            if (user instanceof Teacher) teacherList.add((Teacher) user);
        }
        return teacherList;
    }

    public void viewStudents() {
        List<Student> studentList = getStudentList();
        for (Student student : studentList) {
            studentView.sendOnConsole(student);
        }
    }

    public void viewTeachers() {
        List<Teacher> teacherList = getTeacherList();
        for (Teacher teacher : teacherList) {
            teacherView.sendOnConsole(teacher);
        }
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> strudentList, int number) {
        return studyGroupService.createStudyGroup(teacher, strudentList, number);
    }

    public StudyGroup createStudyGroup(int number) {
        List<Teacher> teacherList = getTeacherList();
        List<Student> studentList = getStudentList();
        if (teacherList.isEmpty()) return null;
        else return createStudyGroup(teacherList.getFirst(), studentList, number);
    }

    public void viewStudyGroup(StudyGroup studyGroup) {
        studyGroupView.sendOnConsole(studyGroup);
    }
}
