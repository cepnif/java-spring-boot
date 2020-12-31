package com.fincityltd.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(name="student_first_name")
    private String firstName;
    private String lastName;
    private String email;
    @Transient
    private String city;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;
}
