package com.example.view2_2.model.view

import org.hibernate.annotations.Immutable
import org.hibernate.annotations.Subselect
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Immutable
@Subselect("SELECT " +
        "e.id AS employee_id, " +
        "concat(e.first_name, ' ', e.last_name) as name, " +
        "e.salary AS salary, " +
        "j.title AS job_title, " +
        "d.name AS departament_name " +
        "FROM employees e " +
        "INNER JOIN departments d ON e.department_id = d.id " +
        "INNER JOIN jobs j ON e.job_id = j.id")
data class EmployeeSalary(@Id val employeeId:Int, @Column val name:String?,
                          @Column val salary:Double?, @Column val jobTitle:String?, @Column val departamentName:String?)