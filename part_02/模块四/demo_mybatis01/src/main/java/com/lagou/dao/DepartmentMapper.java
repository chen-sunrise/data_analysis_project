package com.lagou.dao;

import com.lagou.domain.Department;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentMapper {
    /*根据id查询部门信息*/
    @Select("select * from t_department")
    public List<Department> findAll();

    @Select("select * from t_department where dept_id = #{deptId}")
    public Department findById(int deptId);
}
