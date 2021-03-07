package com.lagou.demo_mybatis01;

import com.lagou.dao.DepartmentMapper;
import com.lagou.dao.EmployeeMapper;
import com.lagou.domain.Department;
import com.lagou.domain.Employee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoMybatis01ApplicationTests {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void contextLoads() {
        List<Department> all = departmentMapper.findAll();
        for (Department department : all) {
            System.out.println(department);
        }
    }

    @Test
    public void findById(){
        Department byId = departmentMapper.findById(1);
        System.out.println(byId);
    }

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void getAll(){
        List<Employee> all = employeeMapper.findAll();
        for (Employee employee : all) {
            System.out.println(employee);
        }
    }

    @Test
    public void getEmy(){
        Employee byId = employeeMapper.findById(1);
        System.out.println(byId);
    }

}
