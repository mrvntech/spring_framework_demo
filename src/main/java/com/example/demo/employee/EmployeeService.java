package com.example.demo.employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public String getEmployeeInformationById(int id){
        return new Employee().getEmployeeInformation();
    }
}
