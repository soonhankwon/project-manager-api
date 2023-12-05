package dev.projectmanagerapi.user.controller

import dev.projectmanagerapi.user.dto.UserCreateRequest
import dev.projectmanagerapi.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    val userService: UserService
) {

    @PostMapping
    fun createUser(@RequestBody request: UserCreateRequest): ResponseEntity<String> {
        userService.createUser(request)
        return ResponseEntity.status(HttpStatus.CREATED).body("created")
    }
}