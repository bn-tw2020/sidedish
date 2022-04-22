package com.example.todo.sidedish.data.dto

import com.google.gson.annotations.SerializedName

data class OrderDto(
    @SerializedName("payload")
    val order: OrderDetail,
)

data class OrderDetail(
    @SerializedName("channel")
    val channel: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("icon_emoji")
    val iconEmoji: String,
)