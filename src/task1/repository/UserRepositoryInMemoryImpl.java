package task1.repository;

import task1.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryInMemoryImpl {

    private final List<User> users = new ArrayList<>();

    public UserRepositoryInMemoryImpl() {
        users.add(new User("Danil", "Popov", "dpopov@gmail.com", "zxcvbn1"));
        users.add(new User("Anya", "Sopova", "asopova@gmail.com", "zxcvbn2"));
        users.add(new User("Vlad", "Dopov", "vdopov@gmail.com", "zxcvbn3"));
    }

    public User finUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }

        return null;
    }
}
