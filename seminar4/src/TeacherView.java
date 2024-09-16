import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> users) {
        for (Teacher user : users) {
            System.out.println(user);
        }
    }
}
