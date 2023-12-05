package dev.projectmanagerapi.team.controller

import dev.projectmanagerapi.team.service.TeamService
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/teams")
class TeamController(
    val teamService: TeamService
) {
}