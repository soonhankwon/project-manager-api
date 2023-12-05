package dev.projectmanagerapi.user.dto

data class UserCreateRequest(
    val name: String,
    val password: String
)
