import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService{
    private final Group<Student> group;

    public StudentGroupService(Group<Student> group) {
        this.group = group;
    }

    public boolean removeMember(String firstName, String secondName, String lastName) {

        for (Student stud : group) {
            if (stud.getFirstName().equals(firstName) &&
                    stud.getSecondName().equals(secondName) &&
                    stud.getLastName().equals(lastName)) {
                group.getMembers().remove(stud);
                return true;
            }
        }
        return false;
    }

    public void create(Student user) {
        group.addMember(user);
    }


    public List<Student> sortMembersByFullName() {
        List<Student> members = new ArrayList<>(group.getMembers());
        members.sort(new UserComparator<>());
        return members;
    }

    public List<Student> sortStudentsByAge() {
        List<Student> studentList = new ArrayList<>(group.getMembers());
        Collections.sort(studentList);
        return studentList;
    }
}
