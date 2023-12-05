package dev.projectmanagerapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProjectManagerApiApplication

fun main(args: Array<String>) {
    runApplication<ProjectManagerApiApplication>(*args)
}
