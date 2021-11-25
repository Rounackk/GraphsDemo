package com.cg.pacs.pacsDemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "User_Table")
public class User {
    /*@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;*/

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Id
    @Column(unique = true,nullable = false)
    private Integer rollNo;
}
