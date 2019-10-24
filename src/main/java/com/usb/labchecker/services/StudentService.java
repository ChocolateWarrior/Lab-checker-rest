package com.usb.labchecker.services;

import com.usb.labchecker.dto.StudentDto;
import com.usb.labchecker.entities.Student;
import com.usb.labchecker.exceptions.StudentNotFoundException;
import com.usb.labchecker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student){
        studentRepository.save(student);
        return student;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(int id){
        return studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
    }

    public Student update(int id, StudentDto studentDto) {
        Student studentToUpdate = studentRepository.getOne(id);

        if(Objects.nonNull(studentDto.getName()))
            studentToUpdate.setName(studentDto.getName());

        if(Objects.nonNull(studentDto.getGroup()))
            studentToUpdate.setGroup(studentDto.getGroup());

        if(Objects.nonNull(studentDto.getEmail()))
            studentToUpdate.setEmail(studentDto.getEmail());

        if(Objects.nonNull(studentDto.getGithubUrl()))
            studentToUpdate.setGithubUrl(studentDto.getGithubUrl());

        studentRepository.save(studentToUpdate);
        return studentToUpdate;
    }
}
