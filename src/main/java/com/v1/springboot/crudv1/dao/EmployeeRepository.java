package com.v1.springboot.crudv1.dao;

import com.v1.springboot.crudv1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that it's ... no need to write any code LOL!
}
