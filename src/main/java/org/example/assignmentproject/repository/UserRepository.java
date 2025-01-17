package org.example.assignmentproject.repository;

import org.example.assignmentproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
