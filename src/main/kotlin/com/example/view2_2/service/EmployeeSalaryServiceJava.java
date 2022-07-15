package com.example.view2_2.service;

import com.example.view2_2.model.view.EmployeeSalaryJava;
import com.example.view2_2.repository.EmployeeSalaryRepositoryJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSalaryServiceJava {

    @Autowired
    private EmployeeSalaryRepositoryJava employeeSalaryRepositoryJava;

    public List<EmployeeSalaryJava> findAll() {
        return employeeSalaryRepositoryJava.findAll();
    }

}
