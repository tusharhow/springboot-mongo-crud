package com.springmongokotlin.springmongokotlin.models

import org.springframework.data.mongodb.core.mapping.Document

@Document
 class Employee{
    val id: Int? = null
    var name: String? = null
    var email: String?=null
    var phone: String?=null
    var address: String?=null
    var salary: Double?=null
}