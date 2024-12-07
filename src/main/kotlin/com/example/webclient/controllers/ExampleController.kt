package com.example.webclient.controllers

import com.example.webclient.clients.FmpClient
import com.example.webclient.clients.WineClient
import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExampleController(private val fmpClient: FmpClient, private val wineClient: WineClient) {

    @GetMapping("/get/fmp")
    fun getFmpAA(): Any = runBlocking {
        fmpClient.getAA()
    }


    @GetMapping("/get/wine/{category}")
    fun getWine(@PathVariable category: String): Any = runBlocking {
        wineClient.getWine(category)
    }
}