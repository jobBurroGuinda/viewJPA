package com.example.view2_2.controller;

import com.example.view2_2.model.view.EmployeeSalaryJava;
import com.example.view2_2.service.EmployeeSalaryServiceJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/java")
public class ControllerJava {

    @Autowired
    private EmployeeSalaryServiceJava employeeSalaryServiceJava;

    @GetMapping("")
    public String saludo(){
        return "Hola mundote desde Java!";
    }

    @GetMapping("/findAll")
    public List<EmployeeSalaryJava> findAll() {
        return employeeSalaryServiceJava.findAll();
    }

}
