import java.util.Objects;

public class Student implements Comparable<Student> {
    private static int count = 0;
    private final int studentID;
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;

    public Student(String firstName, String secondName, String lastName, int age) {
        studentID = count;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.lastName = surname;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID &&
                age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(secondName, student.secondName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, firstName, secondName, lastName, age);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

}

