package ro.jtonic.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

class EchoTask extends DefaultTask {

    @Input @Optional String message = 'default'

    @TaskAction
    def echo() {
        println "echo: $message"
    }
}
