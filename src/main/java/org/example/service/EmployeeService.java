package org.example.service;

import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> all();

    void add(EmployeeDto employeeDto);

    EmployeeDto search(Long id);

    void update(EmployeeDto employeeDto);

    void delete(Long id);
}
