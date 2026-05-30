package com.gachugu.repository;

import com.gachugu.entity.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findByActiveOrderByUserLastNameAsc(boolean active);
    Page<Staff> findByActive(boolean active, Pageable pageable);
    List<Staff> findByDepartment(String department);
}
