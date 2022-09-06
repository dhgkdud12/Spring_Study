package com.example.spring.service;

import com.example.spring.VO.StudentVO;
import com.example.spring.domain.Student;
import com.example.spring.dto.StudentUpdateRequestDto;

import java.util.List;

public interface IStudentService {
    public void insertStudent(Student student);
    public List<Student> selectAllStudents();
    public StudentVO selectStudent(int id);
    public void updateStudent(int id, StudentUpdateRequestDto studentDto);
    public void deleteStudent(int id);
    public void deleteAllStudents();
}
