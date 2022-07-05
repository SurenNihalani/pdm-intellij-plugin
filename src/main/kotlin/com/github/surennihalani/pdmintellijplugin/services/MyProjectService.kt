package com.github.surennihalani.pdmintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.surennihalani.pdmintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
