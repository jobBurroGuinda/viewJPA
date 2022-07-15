package com.example.view2_2.controller

import com.example.view2_2.model.view.EmployeeSalary
import com.example.view2_2.service.EmployeeSalaryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class Controller {

    @Autowired
    val employeeSalaryService: EmployeeSalaryService? = null

    @GetMapping("")
    fun saludo():String?{
        return "Hola mundito!"
    }

    @GetMapping("/findAll")
    fun findAll():List<EmployeeSalary> {
        return employeeSalaryService!!.findAll()
    }

}