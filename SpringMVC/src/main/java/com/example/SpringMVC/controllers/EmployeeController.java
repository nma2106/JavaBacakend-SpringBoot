package com.example.SpringMVC.controllers;

import com.example.SpringMVC.Service.EmployeeService;
import com.example.SpringMVC.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

//    @GetMapping(path = "/getsecretmessage")
//    public String getmySecretmessage(){
//        return "Dummy message";
//    }
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    // PATH VARIABLE
    @GetMapping("/employee/{employeeId}")
    public EmployeeDTO employeeDTObyID(@PathVariable Long employeeId){
    //return new EmployeeDTO(employeeId, "Name", 55,"name@name.com",true, LocalDate.of(2024, 2,25));
//        EmployeeDTO employeeByid = employeeService.getEmployeeByid(employeeId);
//        return employeeByid;
        return employeeService.getEmployeeByid(employeeId);
    }

    //REQUEST PARAMETERS
    @GetMapping(path = "/employees")
    public String getallEmployeeByID(@RequestParam(required = false) int age){
        return "Hi your age is "+age;

    }

    @PostMapping("/postemployee")
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }
    //    WHEN WE WANT TO UPDATE THE WHOLE DATA
    @PutMapping("/update/{employeeId}")
    EmployeeDTO updateEmployeeById(@RequestBody EmployeeDTO employeeDTO, @PathVariable Long employeeId){
        return employeeService.updateEmployeeById(employeeId, employeeDTO);
    }

    @DeleteMapping("/delete/{employeeId}")
    public void deleteEmployeeById(@PathVariable Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }

    @PatchMapping(path = "/patch/{employeeId}")
    EmployeeDTO updatePartialEmployeeById(@RequestBody EmployeeDTO employeeDTO, @PathVariable Long employeeId){
        return employeeService.updateEmployeeById(employeeId, employeeDTO);
    }


}
