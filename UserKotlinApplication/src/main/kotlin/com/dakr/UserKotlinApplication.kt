package com.dakr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserKotlinApplication

fun main(args: Array<String>) {
	runApplication<UserKotlinApplication>(*args)
}
