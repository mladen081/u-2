package u.service;

import u.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User ussr);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
