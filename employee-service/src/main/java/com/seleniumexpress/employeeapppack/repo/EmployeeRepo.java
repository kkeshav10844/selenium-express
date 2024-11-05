package com.seleniumexpress.employeeapppack.repo;

import com.seleniumexpress.employeeapppack.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
}
