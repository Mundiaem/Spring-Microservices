package com.org.departmentservice.service;

import com.org.departmentservice.entity.Department;
import com.org.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created with love by mundiaem
 * created on 18/07/2021
 * Time: 16:26
 * ⚡  - Department Service
 */
@Slf4j
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");

        return departmentRepository.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
