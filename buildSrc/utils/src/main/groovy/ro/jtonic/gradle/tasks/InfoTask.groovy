package ro.jtonic.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class InfoTask extends DefaultTask {

    @Input @Optional String prefix = 'Gradle version:'

    @OutputFile @Optional File output = new File('output.txt')

    @TaskAction
    def info() {
        def gradleVersion = "$prefix $project.gradle.gradleVersion"
        println gradleVersion
        output.text = gradleVersion
    }
}
