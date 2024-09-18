package controller;

import model.Teacher;
import service.GroupService;
import service.TeacherService;
import view.UserView;

// todo: Поменять тип teacherView с View на UserView, чтобы реализацию данного класса сделать независимой от конкретной
//       реализации интерфейса UserView
// todo: Поменять тип teacherService с TeacherService на его родительский абстрактный класс GroupService<Teacher>
//       с той же целью

public class TeacherController implements UserController<Teacher>{
    private final GroupService<Teacher> teacherService;
    private final UserView<Teacher> teacherView;

    public TeacherController(GroupService<Teacher> groupService, UserView<Teacher> userView) {
        this.teacherService = groupService;
        this.teacherView = userView;
    }

    @Override
    public void create(Teacher user) {
        teacherService.create(user);
    }

    public boolean removeTeacher(String firstName, String secondName, String lastName) {
        return teacherService.removeMember(firstName, secondName, lastName);
    }

    public Teacher getTeacherByName(String firstName, String secondName, String lastName) {
        return teacherService.getMemberByName(firstName, secondName, lastName);
    }

    public boolean setSubjectOfTeacherByName(String firstName, String secondName, String lastName, String subject) {
        Teacher teacher = getTeacherByName(firstName, secondName, lastName);
        System.out.println("\"" + teacher + "\" теперь будет преподавать " + subject);
        return ((TeacherService)teacherService).setSubjectOfTeacherByName(teacher, subject);
    }

    public void sendOnConsole() {
        System.out.println("------------Teachers by full name--------------------");
        teacherView.sendOnConsole(teacherService.sortMembersByFullName());
        System.out.println("-----------------------------------------------------");
    }

    public void sendOnConsoleBySubject() {
        System.out.println("----------------Teachers by subject-----------------");
        teacherView.sendOnConsole(teacherService.sortByField());
        System.out.println("-----------------------------------------------------");
    }
}
