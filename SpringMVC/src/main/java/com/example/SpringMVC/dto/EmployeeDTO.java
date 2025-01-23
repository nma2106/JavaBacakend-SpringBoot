package com.example.SpringMVC.dto;

import java.time.LocalDate;

public class  EmployeeDTO {

    private Long id ;
    private String name;
    private Integer age;
    private String mail;
    private Boolean isActive;
    private LocalDate dateOfJoining;

//    public EmployeeDTO(Long employeeId, String name, int age, String mail, boolean isActive, LocalDate of) {
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public EmployeeDTO(Long id, String name, Integer age, String mail, Boolean isActive, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.isActive = isActive;
        this.dateOfJoining = dateOfJoining;
    }

    public EmployeeDTO() {
    }
}
