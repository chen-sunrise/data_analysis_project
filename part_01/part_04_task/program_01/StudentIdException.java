package com.lagou.housework02;

public class StudentIdException extends Exception {
    static final long serialVersionUID = 7818375828146090155L; // 序列化的版本号  与序列化操作有关系

    public StudentIdException() {
    }

    public StudentIdException(String message) {
        super(message);
    }
}
