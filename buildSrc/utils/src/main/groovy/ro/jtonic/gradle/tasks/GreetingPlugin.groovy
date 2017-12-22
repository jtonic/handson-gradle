package ro.jtonic.gradle.tasks

import org.gradle.api.Plugin
import org.gradle.api.Project


class GreetingPluginExtension {

    String name = 'Antonel Ernest Pazargic'
}

class GreetingPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.logger.quiet("Applying greeting plugin...")
        def greetingExtension = project.extensions.create('greeting', GreetingPluginExtension)
        project.tasks.create("greeting") {
            group = 'tony'
            doLast {
                project.logger.quiet("Hello $greetingExtension.name.")
            }
        }
    }
}
