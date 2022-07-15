package com.example.view2_2.repository;

import com.example.view2_2.model.view.EmployeeSalaryJava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSalaryRepositoryJava extends JpaRepository<EmployeeSalaryJava, Integer> {
}
