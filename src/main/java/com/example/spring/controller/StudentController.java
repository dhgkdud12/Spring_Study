package com.example.spring.controller;

import com.example.spring.VO.StudentVO;
import com.example.spring.domain.Student;
import com.example.spring.dto.StudentUpdateRequestDto;
import com.example.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // 학번, 이름 등록
    @PostMapping("/register")
    public String register(@RequestBody Student student) {
        service.insertStudent(student);
        return "학생 등록완료";
    }

    // 학생 학번 검색
    @GetMapping("/{id}")
    public StudentVO readStudent(@PathVariable("id") int id) {
        return service.selectStudent(id);
    }


    // 모든 학생 검색
    @GetMapping("/")
    public List<Student> list() {
        return service.selectAllStudents();
    }

    // 학생 이름 수정
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable("id") int id, @RequestBody StudentUpdateRequestDto requesttDto) {
        System.out.println(id + " 학생이름 수정되었습니다");
        System.out.println(requesttDto.getName());
        service.updateStudent(id,requesttDto);
        return "수정 완료";
    }


    // 학생 학번 삭제
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        System.out.println(id + " 학생 삭제되었습니다");
        service.deleteStudent(id);
        return "삭제 완료";
    }

    // 학생 모두 삭제
    @DeleteMapping("/")
    public String deleteAll() {
        service.deleteAllStudents();
        return "학생 모두 삭제완료";
    }
}
