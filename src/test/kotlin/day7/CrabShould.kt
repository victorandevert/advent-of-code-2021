package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File

class CrabShould {

    private lateinit var crab: Crab

    @BeforeEach
    fun setup() {
        crab = Crab()
    }

    @Test
    fun `align without wasting fuel`() {
        assertThat(crab.alignHorizontally(arrayListOf(5))).isEqualTo(0)
    }

    @Test
    fun `align using the 1 fuel`() {
        assertThat(crab.alignHorizontally(arrayListOf(16,15))).isEqualTo(1)
    }

    @Test
    fun `align using the 37 fuel`() {
        assertThat(crab.alignHorizontally(getCrabsFromFile("crabs.txt"))).isEqualTo(37)
    }

    private fun getCrabsFromFile(fileName: String): List<Int> {
        val uri = this.javaClass.classLoader.getResource(fileName)
        return File(uri.file).readText().split(",").map { it.toInt() }.toList()
    }

}