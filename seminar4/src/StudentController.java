import java.util.List;

public class StudentController implements UserController<Student> {
    private StudentGroupService groupService;
    private final View<Student> studentView;

    public StudentController(Group<Student> group) {
        this.groupService = new StudentGroupService(group);
        this.studentView = new View<>();
    }

    public void setStudyGroupService(Group<Student> group) {
        this.groupService = new StudentGroupService(group);
    }

    public boolean removeStudent(String firstName, String secondName, String lastName) {
        System.out.println("Remove student: " + firstName + " " + secondName + " " + lastName);
        return groupService.removeMember(firstName, secondName, lastName);
    }

    public List<Student> sortStudentsByAge() {
        System.out.println("Sort students by age:");
        return groupService.sortStudentsByAge();
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
