package dev.projectmanagerapi.team.repository

import dev.projectmanagerapi.team.domain.Team
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository: JpaRepository<Team, Long> {
}