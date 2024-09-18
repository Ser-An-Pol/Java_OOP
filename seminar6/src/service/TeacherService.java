package service;

import model.Group;
import model.Teacher;
import java.util.List;

//todo Для соблюдения 5ого принципа SOLID ранее реализованный внутри класса метод сортировки вынести в отдельный класс,
//     наследуемый от интерфейса. Таким образом, при редактировании сортировки, текущий класс остается неизменным

public class TeacherService extends GroupService<Teacher>{

    private final SortUsers<Teacher> sortUsers;
    public TeacherService(Group<Teacher> group, SortUsers<Teacher> sortUsers) {
        super(group);
        this.sortUsers = sortUsers;
    }

    public List<Teacher> sortByField() {
        return sortUsers.sortByField(group);
    }

    public boolean setSubjectOfTeacherByName(Teacher teacher, String subject) {
        if (teacher == null) return false;
        else {
            teacher.setSubject(subject);
            return true;
        }
    }
}
