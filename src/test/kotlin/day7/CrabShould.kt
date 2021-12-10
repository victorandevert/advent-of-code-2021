package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CrabShould {

    private lateinit var crab: Crab

    @BeforeEach
    fun setup() {
        crab = Crab()
    }

    @Test
    fun `align without wasting fuel`() {
        assertThat(crab.alignHorizontally("5")).isEqualTo(0)
    }

}