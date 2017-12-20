package ro.jtonic.gradle.tasks

import org.assertj.core.api.Assertions
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 19/12/2017.
 * @author Antonel Ernest Pazargic
 */
class InfoTaskTest {

    @Test
    void "test the sheet"() {
        def project = ProjectBuilder.builder().build()
        def infoTask = project.tasks.create('info', InfoTask.class)

        def outputFilePath = "${project.buildDir}/output.txt"
        infoTask.prefix = "Gr. ver."
        infoTask.output = new File(outputFilePath)

        infoTask.prefix = "Gradle info:"
        infoTask.execute()

        // assertion
        Assertions.assertThat(new File(outputFilePath)).exists()
    }
}
