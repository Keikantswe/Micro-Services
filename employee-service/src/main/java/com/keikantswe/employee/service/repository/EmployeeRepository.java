package com.keikantswe.employee.service.repository;

import com.keikantswe.employee.service.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    Optional<EmployeeEntity> findEmployeeByEmployeeId(Long employeeId);
}
