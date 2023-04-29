package com.example.lab2

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

public class JsonConverter {
    private val objectMapper: ObjectMapper = jacksonObjectMapper()

    fun toJson(item: Item): String {
        return try {
            objectMapper.writeValueAsString(item)
        } catch (e: Exception) {
            throw RuntimeException("Error serializing object to JSON", e)
        }
    }

    fun fromJson(json: String): Item {
        return try {
            objectMapper.readValue(json, Item::class.java)
        } catch (e: Exception) {
            throw RuntimeException("Error deserializing JSON to object", e)
        }
    }
}