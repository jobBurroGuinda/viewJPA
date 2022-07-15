package com.example.view2_2.model

import javax.persistence.*

@Entity
data class Jobs(@Column var title:String?) {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    var id = 0

    @OneToMany(mappedBy = "job")
    var employees: Set<Employees>? = null


}
