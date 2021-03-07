package com.lagou.dao;

import com.lagou.domain.Department;
import com.lagou.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> findAll();

    public Employee findById(int empId);
}
