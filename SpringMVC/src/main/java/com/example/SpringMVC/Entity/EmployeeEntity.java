package com.example.SpringMVC.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "employees")

public class EmployeeEntity {

    @Id
    //PRIMARY KEY
    //Auto increment
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name;
    private Integer age;
    private String mail;
    private Boolean isActive;
    private LocalDate dateOfJoining;
}
