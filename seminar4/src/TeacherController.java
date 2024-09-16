public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController(Group<Teacher> group) {
        this.teacherService = new TeacherService(group);
        this.teacherView = new TeacherView();
    }

    @Override
    public void create(Teacher user) {
        teacherService.create(user);
    }

    public boolean removeTeacher(String firstName, String secondName, String lastName) {
        return teacherService.removeMember(firstName, secondName, lastName);
    }

    public Teacher getTeacherByName(String firstName, String secondName, String lastName) {
        return teacherService.getTeacherByName(firstName, secondName, lastName);
    }

    public boolean setSubjectOfTeacherByName(String firstName, String secondName, String lastName, String subject) {
        Teacher teacher = getTeacherByName(firstName, secondName, lastName);
        if (teacher == null) return false;
        else {
            System.out.println("\"" + teacher + "\" теперь будет преподавать " + subject);
            teacher.setSubject(subject);
            return true;
        }
    }

    public void sendOnConsole() {
        System.out.println("----------------------Teachers-----------------------");
        teacherView.sendOnConsole(teacherService.sortMembersByFullName());
        System.out.println("-----------------------------------------------------");
    }
}
