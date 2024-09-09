//todo
// -Создать класс Студент
// -Создать класс УчебнаяГруппа
// -Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
// -Реализовать его контракты (включая удаление)

//todo
// -Модифицировать класс УчебнаяГруппа, заставив его реализовать интерфейс Iterable
// -Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
// -Создать класс УчебнаяГруппаСервис, добавив в него метод удаления студента по ФИО
// -Создать класс Контроллер, добавив в него метод удаления студента и вызывать в нем созданный метод из УчебнаяГруппаСервис

//todo
// -Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
// -Реализовать контракт compareTo() со сравнением по какому-либо параметру (пример studentId)
// -Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по id
// -Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по id
//  и вызывать в нем созданный метод из УчебнаяГруппаСервис

//todo
// -Создать класс СтудентКомпаратор реализующий интерфейс Comparator
// -Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
// -Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по ФИО
// -Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по ФИО и вызывать в нем
// созданный метод из УчебнаяГруппаСервис

//todo (Homework)
// -Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable
// -Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток
// -Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator
// -Модифицировать класс Контроллер, добавив в него созданный сервис
// -Модифицировать класс Контроллер, добавив в него метод сортирующий список УчебныхГрупп, путем вызова созданного сервиса

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup(123);
        studyGroup.addStudent(new Student("Пётр", "Андреевич", "Васюков", 21));
        studyGroup.addStudent(new Student("Нина", "Васильевна", "Кунина", 20));
        studyGroup.addStudent(new Student("Александр", "Николаевич", "Грохов", 23));

        StudyGroupIterator iterator = new StudyGroupIterator(studyGroup);

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        StudyGroup studyGroup1 = new StudyGroup(124);
        studyGroup1.addStudent(new Student("Елизавета", "Александровна", "Кострова", 19));
        studyGroup1.addStudent(new Student("Алевтина", "Георгиевна", "Пущина", 18));

        StudyGroupIterator iterator1 = new StudyGroupIterator(studyGroup1);

        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());

        Stream stream = new Stream();
        stream.addStudyGroup(studyGroup);
        stream.addStudyGroup(studyGroup1);

        Controller controller = new Controller(studyGroup, stream);
        System.out.println(controller.sortStudentsByAge());
        System.out.println(controller.sortStudentsByFirstLastName());

        controller.setStudyGroupService(studyGroup1);
        System.out.println(controller.sortStudentsByAge());

        System.out.println(stream.getStudyGroupList());
        System.out.println(controller.sortByCountOfGroup());

        controller.setStudyGroupService(studyGroup);
        controller.removeStudent("Пётр", "Андреевич", "Васюков");
        System.out.println(studyGroup.getStudentList());
    }
}