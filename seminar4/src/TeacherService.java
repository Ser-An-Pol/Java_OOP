import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private final Group<Teacher> group;

    public TeacherService(Group<Teacher> group) {
        this.group = group;
    }

    public boolean removeMember(String firstName, String secondName, String lastName) {
        for (Teacher teacher : group) {
            if (teacher.getFirstName().equals(firstName) &&
                    teacher.getSecondName().equals(secondName) &&
                    teacher.getLastName().equals(lastName)) {
                System.out.println("\"" + teacher + "\" удаляется!");
                group.getMembers().remove(teacher);
                return true;
            }
        }
        return false;
    }

    public Teacher getTeacherByName(String firstName, String secondName, String lastName) {
        for (Teacher teacher : group) {
            if (teacher.getFirstName().equals(firstName) &&
                    teacher.getSecondName().equals(secondName) &&
                    teacher.getLastName().equals(lastName))
                return teacher;
        }
        return null;
    }

    public void create(Teacher user) {
        group.addMember(user);
    }


    public List<Teacher> sortMembersByFullName() {
        List<Teacher> members = new ArrayList<>(group.getMembers());
        members.sort(new UserComparator<>());
        return members;
    }
}
