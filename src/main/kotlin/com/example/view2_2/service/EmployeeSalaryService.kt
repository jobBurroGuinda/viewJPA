package com.example.view2_2.service

import com.example.view2_2.model.view.EmployeeSalary
import com.example.view2_2.repository.EmployeeSalaryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeSalaryService {

    @Autowired
    private val employeeSalaryRepository: EmployeeSalaryRepository? = null

    fun findAll(): List<EmployeeSalary>{
        return employeeSalaryRepository!!.findAll()
    }

}