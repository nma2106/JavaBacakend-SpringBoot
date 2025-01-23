package com.example.SpringMVC.Repository;

import com.example.SpringMVC.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    //Methods
}
