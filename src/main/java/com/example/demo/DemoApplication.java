package com.example.demo;

import com.example.demo.employee.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        employeeController.getEmployees();
    }
}
