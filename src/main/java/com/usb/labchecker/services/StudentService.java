package com.usb.labchecker.services;

import com.usb.labchecker.dto.StudentDto;
import com.usb.labchecker.entities.Student;
import com.usb.labchecker.exceptions.StudentNotFoundException;
import com.usb.labchecker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
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

        if(Objects.nonNull(studentDto.getFirstName()))
            studentToUpdate.setFirstName(studentDto.getFirstName());

        if(Objects.nonNull(studentDto.getLastName()))
            studentToUpdate.setLastName(studentDto.getLastName());

        if(Objects.nonNull(studentDto.getGroupId()))
            studentToUpdate.setGroupId(studentDto.getGroupId());

        if(Objects.nonNull(studentDto.getGithubLink()))
            studentToUpdate.setGithubLink(studentDto.getGithubLink());

        if(Objects.nonNull(studentDto.getTelegramLink()))
            studentToUpdate.setTelegramLink(studentDto.getTelegramLink());

        studentRepository.save(studentToUpdate);
        return studentToUpdate;
    }
}
