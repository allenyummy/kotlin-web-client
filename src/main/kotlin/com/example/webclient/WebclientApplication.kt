package com.example.webclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class WebclientApplication

fun main(args: Array<String>) {
    runApplication<WebclientApplication>(*args)
}
