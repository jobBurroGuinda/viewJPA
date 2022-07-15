package com.example.view2_2.model

import javax.persistence.*

@Entity
data class Departments(@Column var name:String?) {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    var id = 0

    @OneToMany(mappedBy = "departament")
    val  employees: Set<Employees>? = null


}
