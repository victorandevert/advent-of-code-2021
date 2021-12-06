package day6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class LanternfishShould {

    private lateinit var lanternfish: Lanternfish

    @BeforeEach
    fun setup() {
        lanternfish = Lanternfish()
    }

    @Test
    fun `return 1 fish after 2 days`() {
        val fish = mutableListOf(5)

        val amountOffish = lanternfish.spawn(fish, 2)

        assertThat(amountOffish).isEqualTo(1)
    }

    @Test
    fun `return 2 fish after 4 day`() {
        val fish = mutableListOf(3)

        val amountOffish = lanternfish.spawn(fish, 4)

        assertThat(amountOffish).isEqualTo(2)
    }
}