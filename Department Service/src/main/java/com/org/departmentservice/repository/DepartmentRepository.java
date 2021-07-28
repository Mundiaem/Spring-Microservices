package com.org.departmentservice.repository;

import com.org.departmentservice.entity.Department;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created with love by mundiaem
 * created on 18/07/2021
 * Time: 16:25
 * ⚡  - Department Service
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentByDepartmentId(long departmentId);
}
