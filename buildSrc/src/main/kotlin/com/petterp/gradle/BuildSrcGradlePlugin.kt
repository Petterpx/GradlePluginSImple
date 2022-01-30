package com.petterp.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 * @author petterp
 */
class BuildSrcGradlePlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        println("使用BuildSrc方式创建的插件")
    }
}
