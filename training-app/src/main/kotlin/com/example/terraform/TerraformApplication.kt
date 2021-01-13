package com.example.terraform

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TerraformApplication

fun main(args: Array<String>) {
    runApplication<TerraformApplication>(*args)
}
