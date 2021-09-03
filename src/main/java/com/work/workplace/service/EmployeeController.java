package com.work.workplace.service;

import com.work.workplace.model.Employee;
import com.work.workplace.model.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeDAO service;

    @GetMapping("/employees")
     public List<Employee> getAll(){
        return service.getEmployeesList();
    }

    @GetMapping("/employees/{empID}")
    public Employee getEmployeeId(@PathVariable int empID){

        Employee employee = service.getEmployeeById(empID);
        return employee;

    }
    @PostMapping("/employees/newuser")
    public void saveEmployee(@RequestBody Employee newEmployee){
        service.saveEmployee(newEmployee);
    }
}
