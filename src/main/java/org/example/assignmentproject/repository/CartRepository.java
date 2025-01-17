package org.example.assignmentproject.repository;

import org.example.assignmentproject.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
