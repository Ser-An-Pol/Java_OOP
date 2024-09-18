package service;

import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentsByAge implements SortUsers<Student> {
    @Override
    public List<Student> sortByField(Group<Student> members) {
        List<Student> studentList = new ArrayList<>(members.getMembers());
        Collections.sort(studentList);
        return studentList;
    }
}
