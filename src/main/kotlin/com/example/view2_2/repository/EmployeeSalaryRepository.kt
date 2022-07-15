package com.example.view2_2.repository

import com.example.view2_2.model.view.EmployeeSalary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeSalaryRepository : JpaRepository<EmployeeSalary, Integer>