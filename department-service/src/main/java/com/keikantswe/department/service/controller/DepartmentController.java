package com.keikantswe.department.service.controller;

import com.keikantswe.department.service.entity.DepartmentEntity;
import com.keikantswe.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public DepartmentEntity saveDepartment( @RequestBody DepartmentEntity department){
        log.info("inside safeDepartment of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<DepartmentEntity> findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside getDepartmentById of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
