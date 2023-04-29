package com.example.lab2

import org.springframework.boot.autoconfigure.domain.EntityScan

@EntityScan
data class Item(
        var id: Number,
        var title: String,
        var body: String,
        var userId: Number,
)
