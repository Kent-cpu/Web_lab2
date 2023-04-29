package com.example.lab2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

@RestController
@RequestMapping("/api")
class ItemController {
    @GetMapping("/item")
    fun getByTitle() {
        val URL = URL("https://jsonplaceholder.typicode.com/posts/1")
        val connection = URL.openConnection()
        BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
            var line: String?
            while (inp.readLine().also { line = it } != null) {
                println(line)
            }
        }
    }
}