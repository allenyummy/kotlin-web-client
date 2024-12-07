package com.example.webclient.clients

import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody


open class BaseClient(val webClient: WebClient) {

    suspend inline fun <reified T : Any> get(
        baseUrl: String,
        endpoint: String,
    ): T =
        webClient.get()
            .uri("$baseUrl/$endpoint")
            .retrieve()
            .awaitBody<T>()

}