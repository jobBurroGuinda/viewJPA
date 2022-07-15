package com.example.view2_2.model.view;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
@Subselect("" +
        "SELECT e.id as employee_id,\n" +
        "       concat(e.first_name, ' ', e.last_name) as name,\n" +
        "       e.salary as salary,\n" +
        "       j.title as title,\n" +
        "       d.name as department_name\n" +
        "FROM employees e\n" +
        "         INNER JOIN departments d on e.department_id = d.id\n" +
        "         INNER JOIN jobs j on e.job_id = j.id")
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
