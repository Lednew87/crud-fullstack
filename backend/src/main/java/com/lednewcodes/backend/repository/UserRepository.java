package com.lednewcodes.backend.repository;

import com.lednewcodes.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
