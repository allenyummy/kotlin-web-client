package com.example.webclient.clients

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient


@ConfigurationProperties(prefix = "upstream.api.fmp")
data class FmpClientConfig(
    val baseUrl: String,
    val apiKey: String,
)


@Component
class FmpClient(
    webClient: WebClient,
    private val fmpClientConfig: FmpClientConfig
) : BaseClient(webClient) {


    suspend fun getAA() =
        super.get<Any>(
            fmpClientConfig.baseUrl,
            "/search?query=AA&apiKey=${fmpClientConfig.apiKey}"
        )


}