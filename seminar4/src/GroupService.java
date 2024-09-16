import java.util.ArrayList;
import java.util.List;

public class GroupService <T extends User> {
    protected final Group<T> group;

    public GroupService(Group<T> group) {
        this.group = group;
    }

    public boolean removeMember(String firstName, String secondName, String lastName) {

        for (T stud : group) {
            if (stud.getFirstName().equals(firstName) &&
                    stud.getSecondName().equals(secondName) &&
                    stud.getLastName().equals(lastName)) {
                System.out.println("\"" + stud + "\" удаляется!");
                group.getMembers().remove(stud);
                return true;
            }
        }
        return false;
    }

    public T getMemberByName(String firstName, String secondName, String lastName) {
        for (T t : group) {
            if (t.getFirstName().equals(firstName) &&
                    t.getSecondName().equals(secondName) &&
                    t.getLastName().equals(lastName))
                return t;
        }
        return null;
    }

    public void create(T user) {
        group.addMember(user);
    }


    public List<T> sortMembersByFullName() {
        List<T> members = new ArrayList<>(group.getMembers());
        members.sort(new UserComparator<>());
        return members;
    }
}
