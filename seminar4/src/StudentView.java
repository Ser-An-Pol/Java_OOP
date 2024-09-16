import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> users) {
        for (Student user : users) {
            System.out.println(user);
        }
    }
}
