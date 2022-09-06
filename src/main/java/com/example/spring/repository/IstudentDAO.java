package com.example.spring.repository;

import com.example.spring.VO.StudentVO;
import com.example.spring.domain.Student;
import com.example.spring.dto.StudentUpdateRequestDto;

import java.util.List;

public interface IstudentDAO {
    public void insertStudent(Student student);
    public StudentVO selectOne(int id);
    public List<Student> selectAllStudents();
    public void updateStudent(int id, StudentUpdateRequestDto studentDto);
    public void deleteStudent(int id);
    public void deleteAllStudents();


}
