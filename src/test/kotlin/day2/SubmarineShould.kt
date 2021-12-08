package day2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File

class SubmarineShould {

    private lateinit var submarine: Submarine

    @BeforeEach
    fun setup() {
        submarine = Submarine()
    }

    @Test
    fun `get 900 as a final position`() {

        val result = submarine.dive(getCommands("submarine-commands.txt"))

        Assertions.assertThat(result).isEqualTo(900)
    }

   private fun getCommands(fileName: String): List<String> {
        val uri = this.javaClass.classLoader.getResource(fileName)
        return File(uri.file).readLines()
    }
}