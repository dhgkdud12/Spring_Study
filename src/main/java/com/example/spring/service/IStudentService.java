package com.example.spring.service;

import com.example.spring.VO.StudentVO;
import com.example.spring.dto.StudentUpdateRequestDto;

import java.util.List;

public interface IStudentService {
    public void insertStudent(StudentVO scores);
    public List<StudentVO> selectAllStudents();
    public StudentVO selectStudent(int id);
    public void updateStudent(int id, StudentUpdateRequestDto studentDto);
    public void deleteStudent(int id);
    public void deleteAllStudents();
}
