package com.dakr.model

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
@Data
@Entity
@Table(name="User_Kotlin_tbl")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id=0
    var name=""
    var email=""
    var password=""
}