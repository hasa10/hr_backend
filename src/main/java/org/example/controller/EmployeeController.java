package org.example.controller;
import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {
    final EmployeeService employeeService;

    @GetMapping("/all")
    public List<EmployeeDto> all() {
        return employeeService.all();
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody EmployeeDto employeeDto) {
        String result = employeeService.add(employeeDto);
        if (result.equalsIgnoreCase("Employee added successfully.")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.badRequest().body(result);

        }
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
