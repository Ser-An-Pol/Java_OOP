package model;


public class Teacher extends User {
    private int teacherId;

    public Teacher(String lastName, String firstName, String secondName, int teacherId) {
        super(lastName, firstName, secondName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Учитель: {Id = " + teacherId + "; ФИО: " + super.toString() + "}";
    }
}
