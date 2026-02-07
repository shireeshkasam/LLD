package creational.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRegistry implements Registry<User, Role>{

    private final Map<Role, User> map = new ConcurrentHashMap<>();

    public void register(User user) {
        map.put(user.getRole(), user);
    }

    public User clone(Role role) {
        User proto = map.get(role);
        if (proto == null) {
            throw new IllegalArgumentException("No user for role " + role);
        }
        return proto.clone();
    }
}

