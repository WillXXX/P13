package com.example.p13.Model

data class ModelResponse(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)