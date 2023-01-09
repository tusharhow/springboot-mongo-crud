package com.springmongokotlin.springmongokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication
class SpringmongokotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringmongokotlinApplication>(*args)
	println("////////////////////////////////////////////////////////////////: Server started")
}
