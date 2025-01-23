package com.example.SpringMVC.Service;

import com.example.SpringMVC.Entity.EmployeeEntity;
import com.example.SpringMVC.Repository.EmployeeRepository;
import com.example.SpringMVC.dto.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
    private final ModelMapper modelMapper;


    private final EmployeeRepository employeeRepository;

    public EmployeeService( EmployeeRepository employeeRepository,ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeByid(Long employeeId) {
        EmployeeEntity employeeEntity= employeeRepository.findById(employeeId).orElse(null);
//        ModelMapper mapper = new ModelMapper();
        return modelMapper.map(employeeEntity, EmployeeDTO.class);

    }

    public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee) {
        EmployeeEntity tosaveEntity = modelMapper.map(inputEmployee,EmployeeEntity.class);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(tosaveEntity);
        return modelMapper.map(savedEmployeeEntity,EmployeeDTO.class);
    }


    public EmployeeDTO updateEmployeeById(Long employeeId, EmployeeDTO employeeDTO) {

        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        employeeEntity.setId(employeeId);
        EmployeeEntity savedEmployeeEntity= employeeRepository.save(employeeEntity);
        return modelMapper.map(savedEmployeeEntity,EmployeeDTO.class);
    }

    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
