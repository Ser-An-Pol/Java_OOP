package service;

import model.Student;
import model.Teacher;
import model.User;
import model.UserType;

import java.util.ArrayList;
import java.util.List;

public class DataService{
    List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public int creare(UserType who, String lastName, String firstName, String secondName) {
        int idMax = 0;
        for (User user : userList) {
            int id = getId(user);
            if (id > idMax) idMax = id;
        }
        idMax++;
        if (who.equals(UserType.STUDENT)) userList.add(new Student(lastName, firstName, secondName, idMax));
        else userList.add(new Teacher(lastName, firstName, secondName, idMax));
        return idMax;
    }

    private int getId(User user) {
        if (user instanceof Student) return  ((Student)user).getStudentId();
        else return  ((Teacher)user).getTeacherId();
    }

    public User read(int id) {
        for (User user : userList) {
            int uid = getId(user);
            if (uid == id) return user;
        }
        return null;
    }

    public List<User> getUserList() {
        return userList;
    }
}
