package creational.prototype;

public class Client {
    public static void main(String[] args) {
        User u1 = new User(1, "Sirish", Role.ADMIN);
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.register(u1);
        User u2 = userRegistry.clone(u1.getRole());
        System.out.println(u2.getName());
    }
}
