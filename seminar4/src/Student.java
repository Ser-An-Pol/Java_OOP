public class Student extends User implements Comparable<Student> {
    private static int count = 0;
    private final int studentID;
    private int age;

    public Student(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        studentID = count;
        this.age = -1;
        count++;
    }

    public Student(String firstName, String secondName, String lastName, int age) {
        this(firstName, secondName, lastName);
        this.age = age;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ID: " + studentID + " | " + super.toString() + " | Age: " + age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

}

