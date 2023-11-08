package u.service;

import u.dto.UserDto;
import u.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto ussr);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
