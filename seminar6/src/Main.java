import controller.StudentController;
import controller.TeacherController;
import model.Group;
import model.Student;
import model.Teacher;
import service.SortStudentsByAge;
import service.SortTeachersBySubject;
import service.StudentService;
import service.TeacherService;
import view.View;

public class Main {
    public static void main(String[] args) {
        Group<Student> groupOfStudents = new Group<>(1);
        StudentController studentController =
                new StudentController(new StudentService(groupOfStudents, new SortStudentsByAge()),
                        new View<>());

        studentController.create(new Student("Иван", "Иванович", "Иванов", 21));
        studentController.create(new Student("Петр", "Петрович", "Петров", 20));
        studentController.create(new Student("Вадим", "Вадимович", "Вадимов", 22));
        studentController.create(new Student("Сидор", "Сидорович", "Сидоров", 20));
        studentController.create(new Student("Антон", "Антонович", "Антонов", 19));

        studentController.sendOnConsole();


        Group<Teacher> pedStuff = new Group<>(0);
        TeacherController teacherController =
                new TeacherController(new TeacherService(pedStuff, new SortTeachersBySubject()),
                        new View<>());

        teacherController.create(new Teacher("Иван", "Иванович", "Иванов", "Алгебра"));
        teacherController.create(new Teacher("Петр", "Петрович", "Петров", "Физика"));
        teacherController.create(new Teacher("Вадим", "Вадимович", "Вадимов", "Биология"));
        teacherController.create(new Teacher("Сидор", "Сидорович", "Сидоров", "Геометрия"));
        teacherController.create(new Teacher("Антон", "Антонович", "Антонов", "Химия"));

        teacherController.sendOnConsole();
        teacherController.sendOnConsoleBySubject();
        System.out.println();
        teacherController.removeTeacher("Петр", "Петрович", "Петров");
        teacherController.sendOnConsole();
        teacherController.setSubjectOfTeacherByName("Сидор", "Сидорович", "Сидоров", "Физика");
        teacherController.sendOnConsole();

    }
}