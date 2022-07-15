package com.example.view2_2.model

import javax.persistence.*

@Entity
data class Employees(@Column var firstName:String?, @Column var lastName:String?, @Column var salary:Double?) {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    var id = 0

    @ManyToOne
    @JoinColumn(name="department_id", nullable=false)
    var departament: Departments? = null

    @ManyToOne
    @JoinColumn(name="job_id", nullable=false)
    var job: Jobs? = null


}