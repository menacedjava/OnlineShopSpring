package org.example.assignmentproject.repository;

import org.example.assignmentproject.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Optional<Admin> findById(Integer  id);
}
