package day1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File

class DepthMeasurementShould {

    private lateinit var depthMeasurement: DepthMeasurement

    @BeforeEach
    fun setup() {
        depthMeasurement = DepthMeasurement()
    }

    @Test
    fun `seven measurements are larger than the previous measurement`(){
        val measures = listOf(199,200,208,210,200,207,240,269,260,263)

        val result = depthMeasurement.countIncreases(measures)

        assertThat(result).isEqualTo(7)
    }

    @Test
    fun `seven measurements from file are larger than the previous measurement`(){
        val measures = getMeasuresFromFile("measures.txt")

        val result = depthMeasurement.countIncreases(measures)

        assertThat(result).isEqualTo(7)
    }

    private fun getMeasuresFromFile(fileName: String): List<Int> {
        val uri = this.javaClass.classLoader.getResource(fileName)
        return File(uri.file).useLines { it.toList() }.map { it.toInt() }
    }
}