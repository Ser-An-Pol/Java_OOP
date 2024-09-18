package model;

import java.util.Comparator;

public class UserComparator <T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        String s1 = o1.getLastName() + " " + o1.getFirstName() + " " + o1.getSecondName();
        String s2 = o2.getLastName() + " " + o2.getFirstName() + " " + o2.getSecondName();

        return s1.compareTo(s2);
    }
}
