package com.github.xlzhang17.demojtbrainplugin.services

import com.github.xlzhang17.demojtbrainplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
