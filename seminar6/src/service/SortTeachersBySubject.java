package service;

import model.Group;
import model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTeachersBySubject implements SortUsers<Teacher> {
    @Override
    public List<Teacher> sortByField(Group<Teacher> members) {
        List<Teacher> teachers = new ArrayList<>(members.getMembers());
        Collections.sort(teachers);
        return teachers;
    }
}
