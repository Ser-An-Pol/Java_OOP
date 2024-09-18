package controller;

import model.Group;
import model.Student;
import service.GroupService;
import service.SortStudentsByAge;
import service.StudentService;
import view.UserView;

import java.util.List;

// todo: Поменять тип studentView с View на UserView, чтобы реализацию данного класса сделать независимой от конкретной
//       реализации интерфейса UserView
// todo: Поменять тип studentService с StudentService на его родительский абстрактный класс GroupService<Student>
//       с той же целью

public class StudentController implements UserController<Student> {

    private GroupService<Student> groupService;
    private final UserView<Student> studentView;

    public StudentController(GroupService<Student> groupService, UserView<Student> studentView) {
        this.groupService = groupService;
        this.studentView = studentView;
    }

    public void setStudyGroupService(Group<Student> group) {
        this.groupService = new StudentService(group, new SortStudentsByAge());
    }

    public boolean removeStudent(String firstName, String secondName, String lastName) {
        System.out.println("Remove student: " + firstName + " " + secondName + " " + lastName);
        return groupService.removeMember(firstName, secondName, lastName);
    }

    public List<Student> sortStudentsByAge() {
        System.out.println("Sort students by age:");
        return groupService.sortByField();
    }

    public List<Student>  sortStudentsByFullName() {
        System.out.println("Sort students by full name:");
        return groupService.sortMembersByFullName();
    }


    @Override
    public void create(Student user) {
        groupService.create(user);
    }

    public void sendOnConsole() {
        System.out.println("----------------------Students-----------------------");
        studentView.sendOnConsole(sortStudentsByFullName());
        System.out.println("-----------------------------------------------------");
    }
}
