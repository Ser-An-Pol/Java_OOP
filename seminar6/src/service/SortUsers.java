package service;

import model.Group;
import model.User;

import java.util.List;

public interface SortUsers <T extends User> {
    List<T> sortByField(Group<T> members);
}
