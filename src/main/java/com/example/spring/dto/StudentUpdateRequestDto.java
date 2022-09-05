package com.example.spring.dto;

public class StudentUpdateRequestDto {
    private String name;

    public StudentUpdateRequestDto() {
    }

    public StudentUpdateRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
