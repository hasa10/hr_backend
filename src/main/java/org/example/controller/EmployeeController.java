package org.example.controller;
import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {
    final EmployeeService employeeService;

    @GetMapping("/all")
    public List<EmployeeDto> all() {
        return employeeService.all();
    }

    @PostMapping("/add")
    public void add(@RequestBody EmployeeDto employeeDto) {
        employeeService.add(employeeDto);
    }

    @GetMapping("/search")
    public EmployeeDto search(@RequestParam Long id) {
        return employeeService.search(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody EmployeeDto employeeDto) {
        employeeService.update(employeeDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        employeeService.delete(id);
    }

}
