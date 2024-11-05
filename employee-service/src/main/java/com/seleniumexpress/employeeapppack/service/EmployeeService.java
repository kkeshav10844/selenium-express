package com.seleniumexpress.employeeapppack.service;

import com.seleniumexpress.employeeapppack.entity.EmployeeEntity;
import com.seleniumexpress.employeeapppack.repo.EmployeeRepo;
import com.seleniumexpress.employeeapppack.reponse.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo EmployeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeResponse getEmployeeById(int id){
        EmployeeEntity employeeEntity= EmployeeRepo.findById(id).get();

        EmployeeResponse employeeResponse = modelMapper.map(employeeEntity, EmployeeResponse.class);
        return employeeResponse;
    }



}
