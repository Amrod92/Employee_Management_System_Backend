package com.manlio.employeesystem.services;

import com.manlio.employeesystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);


    List<Employee> getAllEMployees();

    boolean deleteEmpleyee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
