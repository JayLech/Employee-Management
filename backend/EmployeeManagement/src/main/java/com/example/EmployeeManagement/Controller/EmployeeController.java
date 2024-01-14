package com.example.EmployeeManagement.Controller;


import com.example.EmployeeManagement.Data.EmployeeSaveData;
import com.example.EmployeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/save")
    public String saveEmployee(@RequestBody EmployeeSaveData employeeSavaData){
        String id = employeeService.addEmployee(employeeSavaData);
        return id;
    }
}
