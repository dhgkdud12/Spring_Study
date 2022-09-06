package com.example.spring.service;

import com.example.spring.VO.StudentVO;
import com.example.spring.domain.Student;
import com.example.spring.dto.StudentUpdateRequestDto;
import com.example.spring.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentDAO dao;

    @Override
    public void insertStudent(Student student) {

        dao.insertStudent(student);
    }

    @Override
    public StudentVO selectStudent(int id) {


        return dao.selectOne(id);
    }

    @Override
    public List<Student> selectAllStudents() {
        return dao.selectAllStudents();
    }


    @Override
    public void updateStudent(int id, StudentUpdateRequestDto studentDto) {
        dao.updateStudent(id, studentDto);
    }

    @Override
    public void deleteStudent(int id) {
        dao.deleteStudent(id);
    }

    @Override
    public void deleteAllStudents() {
        dao.deleteAllStudents();
    }
}
