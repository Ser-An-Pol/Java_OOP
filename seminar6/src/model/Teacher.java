package model;

public class Teacher extends User implements Comparable<Teacher>{
    private final int ID;
    private static int count = 0;
    private String subject;

    public Teacher(String firstName, String secondName, String lastName, String subject) {
        super(firstName, secondName, lastName);
        this.subject = subject;
        this.ID = count;
        count++;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " | " + super.toString() + " | " + this.subject;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.subject.compareTo(o.subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getID() {
        return ID;
    }
}
