package creational.prototype;


public class User implements Prototype<User>{
    private int id;
    private String name;
    private Role role;

    public User(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    @Override
    public User clone() {
        return new User(id, name, role);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }
}
