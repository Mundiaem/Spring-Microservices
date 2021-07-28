package com.org.departmentservice.controller;

import com.org.departmentservice.entity.Department;
import com.org.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * created with love by mundiaem
 * created on 18/07/2021
 * Time: 16:28
 * ⚡  - Department Service
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
       log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }
@GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId){
        log.info("Inside findDepartmentById method of DepartmentController");
return departmentService.findDepartmentById(departmentId);
    }
}
