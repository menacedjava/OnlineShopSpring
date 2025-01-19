package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.AdminDto;
import org.example.assignmentproject.model.Admin;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Admin> getAllAdmins() {
        List<Admin> admins = adminService.getAllAdmins();
        return admins;
    }
    @GetMapping("/{id}")
    public Admin getAdminById(Integer id) {
        Optional<Admin> adminById = adminService.getAdminById(id);
        return adminById.orElse(null);
    }
    @PostMapping
    public Result createAdmin(@RequestBody AdminDto adminDto) {
        Result admin = adminService.createAdmin(adminDto);
        return admin;
    }
    @PutMapping("/{id}")
    public Result updateAdmin(@PathVariable Integer id, AdminDto adminDto) {
        Result admin = adminService.updateAdmin(id, adminDto);
        return admin;
    }
    @DeleteMapping("/{id}")
    public Result deleteAdmin(@PathVariable Integer id) {
        Result admin = adminService.deleteAdmin(id);
        return admin;
    }


}
