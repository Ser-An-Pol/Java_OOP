import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group<T extends User> implements Iterable<T> {
    private final List<T> members;
    private final int numberOfGroup;

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
        members = new ArrayList<>();
    }

    public void addMember(T member) {
        members.add(member);
    }

    public List<T> getMembers() {
        return members;
    }

    @Override
    public Iterator<T> iterator() {
        return new StudyGroupIterator<>(this);
    }

    @Override
    public String toString() {
        return "numberOfGroup=" + numberOfGroup +
                ", CountOfMembers =" + members.size() +
                "}\n";
    }
}
