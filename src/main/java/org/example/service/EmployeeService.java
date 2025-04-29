package org.example.service;

import org.example.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    void save(EmployeeEntity employeeEntity);
    EmployeeEntity getById(Long id);
    List<EmployeeEntity> getAll();
    void delete(Long id);
    void update(Long id, EmployeeEntity employeeEntity);
}
