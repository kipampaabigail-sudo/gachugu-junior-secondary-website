package com.gachugu.repository;

import com.gachugu.entity.User;
import com.gachugu.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByRole(UserRole role);
    List<User> findByRoleAndActive(UserRole role, boolean active);
    boolean existsByEmail(String email);
    
    @Query("SELECT u FROM User u WHERE u.active = true")
    List<User> findAllActive();
}
