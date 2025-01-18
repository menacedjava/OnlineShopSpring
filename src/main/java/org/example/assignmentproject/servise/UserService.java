package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.UserDto;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.model.User;
import org.example.assignmentproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Foydalanuvchini yaratish
    public Result createUser(UserDto userDto) {

        User user = new User();

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return new Result(true, "Saqlandi");

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Foydalanuvchini ID orqali olish
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    // Foydalanuvchini yangilash
    public Result updateUser(Integer id, User updatedUserDetails) {
        Optional<User> existingUserOpt = userRepository.findById(id);

        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            existingUser.setUsername(updatedUserDetails.getUsername());
            existingUser.setPassword(updatedUserDetails.getPassword());
            userRepository.save(existingUser);
            return new Result(true, "User updated successfully");
        }
        return new Result(false, "User not found");

    }

    // Foydalanuvchini o'chirish
    public Result deleteUser(Integer id) {
        if (!userRepository.existsById(id)) {
            return new Result(false, "User not found");
        }
        userRepository.deleteById(id);
        return new Result(true, "User deleted successfully");
    }


}
