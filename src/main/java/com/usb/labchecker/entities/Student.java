package com.usb.labchecker.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Student {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "group")
    private String group;

    @Column(name = "email")
    private String email;

    @Column(name = "githubUrl")
    private String githubUrl;

}
