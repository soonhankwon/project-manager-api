package dev.projectmanagerapi.user.service

import dev.projectmanagerapi.user.domain.User
import dev.projectmanagerapi.user.dto.UserCreateRequest
import dev.projectmanagerapi.user.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    val userRepository: UserRepository
) {
    @Transactional
    fun createUser(request: UserCreateRequest) {
        val user = User(request.name, request.password)
        userRepository.save(user)
    }
}