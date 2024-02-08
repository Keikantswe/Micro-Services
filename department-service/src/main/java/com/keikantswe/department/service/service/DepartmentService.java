package com.keikantswe.department.service.service;

import com.keikantswe.department.service.entity.DepartmentEntity;
import com.keikantswe.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private WebClient webClient;

    public DepartmentEntity saveDepartment(DepartmentEntity department) {
         departmentRepository.save(department);
         return department;
    }
    public Optional<DepartmentEntity> findDepartmentById(Long departmentId) {
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
