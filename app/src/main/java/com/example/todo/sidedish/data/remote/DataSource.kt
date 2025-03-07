package com.example.todo.sidedish.data.remote

import com.example.todo.sidedish.data.dto.MenuDetailDto
import com.example.todo.sidedish.data.dto.MenuDto

interface DataSource {

    suspend fun getMain(): MenuDto

    suspend fun getSoup(): MenuDto

    suspend fun getSide(): MenuDto

    suspend fun getDetail(hash:String): MenuDetailDto
}