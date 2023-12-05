package dev.projectmanagerapi.team.service

import dev.projectmanagerapi.team.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamService(
    val teamRepository: TeamRepository
) {
}