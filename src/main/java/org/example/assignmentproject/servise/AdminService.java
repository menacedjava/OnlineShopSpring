package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.AdminDto;
import org.example.assignmentproject.model.Admin;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Result createAdmin(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        adminRepository.save(admin);
        return new Result(true, "Admin created successfully");
    }

    public Result updateAdmin(Long id, AdminDto adminDto) {
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        if (optionalAdmin.isPresent()) {
            Admin admin = optionalAdmin.get();
            admin.setUsername(adminDto.getUsername());
            admin.setPassword(adminDto.getPassword());
            adminRepository.save(admin);
            return new Result(true, "Admin updated successfully");
        }
        return new Result(false, "Admin not found");
    }

    public Result deleteAdmin(Long id) {
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        if (optionalAdmin.isPresent()) {
            adminRepository.delete(optionalAdmin.get());
            return new Result(true, "Admin deleted successfully");
        }
        return new Result(false, "Admin not found");
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> getAdminById(Integer id) {
        return adminRepository.findById(id);
    }
}


