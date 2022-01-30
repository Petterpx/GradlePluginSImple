package com.petterp.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 * @author petterp
 */
class StandGradlePlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        println("使用独立项目创建的插件")
    }
}
