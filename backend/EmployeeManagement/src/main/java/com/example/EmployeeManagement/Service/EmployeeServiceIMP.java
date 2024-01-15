package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Data.EmployeeSaveData;
import com.example.EmployeeManagement.Entity.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeServiceIMP implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;
    @Transactional
    @Override
    public String addEmployee(EmployeeSaveData employeeSavaData) {
        Employee employee = new Employee(
                employeeSavaData.getName(),
                employeeSavaData.getAddress(),
                employeeSavaData.getMobile()
        );
        employeeRepo.save(employee);

        return employee.getName();
    }
}
