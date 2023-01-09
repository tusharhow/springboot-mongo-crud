package com.springmongokotlin.springmongokotlin.repositories

import com.springmongokotlin.springmongokotlin.models.Employee
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : MongoRepository<Employee, String>