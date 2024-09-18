package model;

import java.util.Iterator;
import java.util.List;

public class GroupIterator<T extends User> implements Iterator<T> {
    private int index;
    private final List<T> members;

    public GroupIterator(Group<T> group) {
        this.index = 0;
        this.members = group.getMembers();
    }

    @Override
    public boolean hasNext() {
        return index < members.size();
    }

    @Override
    public T next() {
        if (this.hasNext()) return members.get(index++);
        else return null;
    }

    @Override
    public void remove() {
        this.members.remove(index);
    }
}
