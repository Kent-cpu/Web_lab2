package com.example.lab2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

@RestController
@RequestMapping("/api")
class ItemController {
    @GetMapping("/item")
    fun getByTitle() {
        val restTemplate = RestTemplate()
        val URL = "https://jsonplaceholder.typicode.com/posts/1"
        val json = restTemplate.getForObject(URL, String::class.java)
        println(json)

        val jsonConverter: JsonConverter = JsonConverter()
        var item: Item = jsonConverter.fromJson(json.toString())
        println(item)

        val jsonItem = jsonConverter.toJson(item)
        println(jsonItem)
    }
}