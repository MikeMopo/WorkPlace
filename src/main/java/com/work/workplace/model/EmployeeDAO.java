package com.work.workplace.model;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAO {
    static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1,"Mike Zowa","Engineer"));
        list.add(new Employee(2,"Nyasha Muzariri","Chemist"));
    }

    public static List<Employee> getEmployeesList() {
        return list;
    }

    public Employee getEmployeeById(int id) {
        return list.stream().filter(emp-> emp.getId()==id).findAny().orElse(null);
    }

    public void saveEmployee(Employee newEmployee) {
        ResponseMessage message = new ResponseMessage();
        message.setResponse("New Employee Added");
        message.setDescription("Updating List");
        message.setDate(LocalDateTime.now());
        newEmployee.setId(list.size()+1);
        list.add(newEmployee);
    }

}
