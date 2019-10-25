package com.usb.labchecker.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Student {

    @Id
    @Column(name = "id_student")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "id_group")
    private String groupId;

    @Column(name = "telegram_link")
    private String telegramLink;

    @Column(name = "git_hub_link")
    private String githubLink;

}
