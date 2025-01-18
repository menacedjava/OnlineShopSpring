package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.UserDto;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.model.User;
import org.example.assignmentproject.servise.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Yangi foydalanuvchi qo‘shish
    @PostMapping
    public Result addUser(@RequestBody UserDto userDto) {
        Result result = userService.createUser(userDto);
        return result;
    }

    // Barcha foydalanuvchilarni olish
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Foydalanuvchini ID orqali olish
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    // Foydalanuvchini yangilash
    @PutMapping("/{id}")
    public Result updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(id, user);
        return new Result(true,"Ok");
    }

    // Foydalanuvchini o‘chirish
    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return new Result(true, "Ok");
    }
}
