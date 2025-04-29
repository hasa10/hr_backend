package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeDao;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDao employeeDao;
    private final ModelMapper modelMapper;

    @Override
    public void save(EmployeeEntity employeeEntity) {

    }

    @Override
    public EmployeeEntity getById(Long id) {
        return null;
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, EmployeeEntity employeeEntity) {

    }
}
