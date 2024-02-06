package com.keikantswe.department.service.repository;

import com.keikantswe.department.service.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    Optional<DepartmentEntity> findDepartmentByDepartmentId(Long departmentId);
}
