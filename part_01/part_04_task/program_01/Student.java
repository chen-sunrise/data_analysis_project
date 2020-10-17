package com.lagou.housework02;

import com.lagou.housework01.AgeException;
import com.lagou.housework01.StudentIdException;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name;
    private int age;

    public Student() {
    }

    public Student(Integer studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, age);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) throws StudentIdException {
        if (!(studentId instanceof Integer)) {
            throw new StudentIdException("学号类型错误");
        }
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age <=0 || age > 100)
            {
//                System.out.println("年龄格式错误！");
//                return;
                throw new AgeException("年龄不合理！");
            }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
