package com.springmongokotlin.springmongokotlin.controllers

import com.springmongokotlin.springmongokotlin.models.Employee
import com.springmongokotlin.springmongokotlin.repositories.EmployeeRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/employee")
class EmployeeController(private  val employeeRepository: EmployeeRepository) {
    @GetMapping("/")
    fun getEmployees(): ResponseEntity<List<Employee>> {
        return ResponseEntity.ok(employeeRepository.findAll())
    }

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable id:String):ResponseEntity<Employee>{
        return ResponseEntity.ok(employeeRepository.findById(id).orElse(null))
    }
    @PostMapping("/")
    fun addEmployee(@RequestBody employee: Employee):ResponseEntity<Employee>{
        return ResponseEntity.ok(employeeRepository.save(employee))

    }
    @PutMapping("/{id}")
    fun updateEmployee(@PathVariable id:String, @RequestBody employee: Employee):ResponseEntity<Employee>{
        val employeeToUpdate=employeeRepository.findById(id).orElse(null)
        employeeToUpdate.name=employee.name
        employeeToUpdate.email=employee.email
        employeeToUpdate.phone=employee.phone
        employeeToUpdate.address=employee.address
        employeeToUpdate.salary=employee.salary
        return ResponseEntity.ok(employeeRepository.save(employeeToUpdate))

    }
    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id:String):ResponseEntity<String>{
       employeeRepository.deleteById(id)
        return ResponseEntity.ok(id)
    }
}

