package view;

import model.User;
import java.util.List;

public class View <T extends User> implements UserView<T>{
    @Override
    public void sendOnConsole(List<T> users) {
        for (T user : users) {
            System.out.println(user);
        }
    }
}
