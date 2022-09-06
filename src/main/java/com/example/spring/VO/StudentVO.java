package com.example.spring.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class StudentVO {
    private int id;

    private String name;


    public StudentVO() {

    }

    public StudentVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentVO studentVO = (StudentVO) o;
        return id == studentVO.id && Objects.equals(name, studentVO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
