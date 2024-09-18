package service;

import model.Group;
import model.Student;

import java.util.List;

//todo Для соблюдения 5ого принципа SOLID ранее реализованный внутри класса метод сортировки вынести в отдельный класс,
//     наследуемый от интерфейса. Таким образом, при редактировании сортировки, текущий класс остается неизменным

public class StudentService extends GroupService<Student> {

    private final SortUsers<Student> sortUsers;

    public StudentService(Group<Student> group, SortUsers<Student> sortUsers) {
        super(group);
        this.sortUsers = sortUsers;
    }

    @Override
    public List<Student> sortByField() {
        return sortUsers.sortByField(group);
    }
}
