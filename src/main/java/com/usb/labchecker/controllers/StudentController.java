package com.usb.labchecker.controllers;

import com.usb.labchecker.dto.StudentDto;
import com.usb.labchecker.entities.Student;
import com.usb.labchecker.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        studentService.save(student);
        return student;
    }

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") int id){
        return studentService.findById(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable("id") int id,
                          @RequestBody StudentDto studentDto){
        return studentService.update(id, studentDto);
    }

}
