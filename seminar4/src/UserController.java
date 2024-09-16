public interface UserController<T extends User> {
    void create(T user);
}
