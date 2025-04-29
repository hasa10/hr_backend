package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeDao;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDao employeeDao;
    private final ModelMapper modelMapper;

    @Override
    public List<EmployeeDto> all() {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        List<EmployeeEntity> all = employeeDao.findAll();
        all.forEach(customerEntity -> {
            employeeDtoList.add(modelMapper.map(customerEntity,EmployeeDto.class));
        });
        return employeeDtoList;
    }

    @Override
    public String add(EmployeeDto employeeDto) {
        if (employeeDao.existsByEmail(employeeDto.getEmail())) {
            return "This email already exists";
        }

        employeeDao.save(modelMapper.map(employeeDto, EmployeeEntity.class));
        return "Employee added successfully.";
    }


    @Override
    public EmployeeDto search(Long id) {
        return modelMapper.map(employeeDao.findById(id), EmployeeDto.class);
    }

    @Override
    public void update(EmployeeDto employeeDto) {
        employeeDao.save(modelMapper.map(employeeDto, EmployeeEntity.class));
    }

    @Override
    public void delete(Long id) {
        employeeDao.deleteById(id);
    }
}
