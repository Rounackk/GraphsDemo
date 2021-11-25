package com.cg.pacs.pacsDemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Daily_Routine")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dayNo;

    private String days;

    @Column(nullable = false)
    private String topicsCovered;

    @Column(name = "Time_Taken_in_Min", nullable = false)
    private Integer timeTaken;


    @OneToOne
    @JoinColumn(name="rollNo_fk", referencedColumnName = "rollNo")
    private User user;
}
