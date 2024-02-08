package com.keikantswe.employee.service.controller;

import com.keikantswe.employee.service.entity.EmployeeEntity;
import com.keikantswe.employee.service.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        log.info("Inside saveEmployee of employee controller");
        return employeeService.saveEmployee(employeeEntity);
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long employeeId){
        return employeeService.findEmployeeById(employeeId);
    }


}
