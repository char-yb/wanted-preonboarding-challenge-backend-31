package com.commerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.modulith.Modulithic

@Modulithic
@SpringBootApplication
class WantedApplication

fun main(args: Array<String>) {
	runApplication<WantedApplication>(*args)
}
