package com.example.view2_2.model.view;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
public class EmployeeSalaryJava {

    @Id
    private int employeeId;

    @Column
    private String name;

    @Column
    private Double salary;

    @Column
    private String jobTitle;

    @Column
    private String departmentName;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
