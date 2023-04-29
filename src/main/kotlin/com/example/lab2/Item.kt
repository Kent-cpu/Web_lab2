package com.example.lab2

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.boot.autoconfigure.domain.EntityScan

@EntityScan
data class Item(
        @JsonProperty("id")
        var id: Number,
        @JsonProperty("title")
        var title: String,
        @JsonProperty("body")
        var body: String,
        @JsonProperty("userId")
        var userId: Number,
)
