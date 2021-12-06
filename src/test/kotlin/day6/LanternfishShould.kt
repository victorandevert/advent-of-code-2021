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
        val fish = mutableListOf(1)

        val amountOffish = lanternfish.spawn(fish, 2)

        assertThat(amountOffish).isEqualTo(1)
    }
}