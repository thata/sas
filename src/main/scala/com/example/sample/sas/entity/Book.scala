package com.example.sample.sas.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity(name = "books")
case class Book() extends Serializable {

  var name:String = _
  var age:Int = 0
  @Id @GeneratedValue var id:Int = 0
}

