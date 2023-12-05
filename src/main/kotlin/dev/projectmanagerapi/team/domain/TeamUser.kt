package dev.projectmanagerapi.team.domain

import dev.projectmanagerapi.user.domain.User
import jakarta.persistence.*

@Entity
class TeamUser(

    @ManyToOne
    var team: Team,

    @ManyToOne
    var user: User,

    // 팀 구성원의 역할(권한)
    @Enumerated(EnumType.STRING)
    var teamUserRole: TeamUserRole
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}