package com.example.webclient.clients

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient


@ConfigurationProperties(prefix = "upstream.api.wine")
data class WineClientConfig(
    val baseUrl: String
)


@Component
class WineClient(
    webClient: WebClient,
    private val wineClientConfig: WineClientConfig
) : BaseClient(webClient) {


    suspend fun getWine(wineCategory: String) =
        super.get<Any>(
            wineClientConfig.baseUrl,
            wineCategory
        )


}