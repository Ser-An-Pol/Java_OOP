//todo
// -Создать класс Юзер и перенести в него базовые поля ( ФИО )
// -Модифицировать ранее созданный класс СтудентКомпаратор
// -Переименовать в ЮзерКомпаратор
// -Типизировать его T наследующегося от типа Юзер ( T extends User )
// -Типизировать реализуемый интерфейс Компаратор T
// -Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T
// -Внести правки места, где использовался предыдущий компаратор

//todo
// -Создать интерфейс ЮзерВью
// -Типизировать его T наследующегося от типа Юзер
// -Создать в нем метод sendOnConsole(List<Student> students) используя типизацию
// -Создать класс СтудентВью реализующий созданный интерфейс

//todo
// -Модифицировать ранее созданный класс Контроллер переименовав его в StudentController
// -Создайте новый интерфейс UserController
// -Опишите в нем метод create
// -Типизировать его T наследующегося от типа Юзер
// -В классе СтудентКонтроллер реализуйте интерфейс UserController
// -Добавить в методы контроллера вывод в консоль с помощью метода sendOnConsole

//todo
// -Создать класс УчительСервис и реализовать аналогично проедланному на семинаре
// -Создать класс УчительВью и реализовать аналогично проедланному на семинаре
// -Создать класс УчительКонтроллер и реализовать возможность создания,
//   редактирования конкретного учителя и отображения списка учителей имеющихся в системе

public class Main {
    public static void main(String[] args) {

        Group<Student> groupOfStudents = new Group<>(1);
        StudentController studentController = new StudentController(groupOfStudents);

        studentController.create(new Student("Иван", "Иванович", "Иванов", 21));
        studentController.create(new Student("Петр", "Петрович", "Петров", 20));
        studentController.create(new Student("Вадим", "Вадимович", "Вадимов", 22));
        studentController.create(new Student("Сидор", "Сидорович", "Сидоров", 20));
        studentController.create(new Student("Антон", "Антонович", "Антонов", 19));

        studentController.sendOnConsole();


        Group<Teacher> pedStuff = new Group<>(0);
        TeacherController teacherController = new TeacherController(pedStuff);

        teacherController.create(new Teacher("Иван", "Иванович", "Иванов", "Алгебра"));
        teacherController.create(new Teacher("Петр", "Петрович", "Петров", "Физика"));
        teacherController.create(new Teacher("Вадим", "Вадимович", "Вадимов", "Биология"));
        teacherController.create(new Teacher("Сидор", "Сидорович", "Сидоров", "Геометрия"));
        teacherController.create(new Teacher("Антон", "Антонович", "Антонов", "Химия"));

        teacherController.sendOnConsole();
        teacherController.sendOnConsoleBySubject();
        teacherController.removeTeacher("Петр", "Петрович", "Петров");
        teacherController.sendOnConsole();
        teacherController.setSubjectOfTeacherByName("Сидор", "Сидорович", "Сидоров", "Физика");
        teacherController.sendOnConsole();

    }
}