package com.example.spring.repository;

import com.example.spring.VO.StudentVO;
import com.example.spring.domain.Student;
import com.example.spring.dto.StudentUpdateRequestDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAO implements IstudentDAO{

    // 학생 정보 저장 리스트 생성
    private List<Student> studentList = new ArrayList<>();

    @Override
    public void insertStudent(Student student) {
        System.out.println("Repository param : "+ student);
        studentList.add(student);
    }

    @Override
    public StudentVO selectOne(int id) {
        Student student = new Student();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                StudentVO studentVO = new StudentVO(student.getId(),student.getName());
                return studentVO;
            }
        }

        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        return studentList;
    }

    @Override
    public void updateStudent(int id, StudentUpdateRequestDto studentDto) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.get(i).setName(studentDto.getName());
            }
        }
    }


    @Override
    public void deleteStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
            }
        }
    }

    @Override
    public void deleteAllStudents() {
        studentList.clear();
    }


}
