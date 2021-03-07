package com.lagou.domain;

public class Employee {
    private int empId;
    private String empName;
    private int deptId;
    private String jboName;
    private String joinTime;
    private String telephone;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptId=" + deptId +
                ", jboName='" + jboName + '\'' +
                ", joinTime='" + joinTime + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getJboName() {
        return jboName;
    }

    public void setJboName(String jboName) {
        this.jboName = jboName;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
