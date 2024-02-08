package com.keikantswe.employee.service.service;

import com.keikantswe.employee.service.entity.EmployeeEntity;
import com.keikantswe.employee.service.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        log.info("inside saveEmployee of EmployeeService");
        employeeRepository.save(employeeEntity);
        return employeeEntity;
    }

    public Optional<EmployeeEntity> findEmployeeById(Long employeeId) {
        return employeeRepository.findEmployeeByEmployeeId(employeeId);
    }
}
