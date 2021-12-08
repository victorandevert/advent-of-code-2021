package day2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SubmarineShould {

    private lateinit var submarine: Submarine

    @BeforeEach
    fun setup() {
        submarine = Submarine()
    }

    @Test
    fun `get 5 as a final position after moving forward`() {

        val result = submarine.dive("forward 5")

        Assertions.assertThat(result).isEqualTo(5)
    }

    @Test
    fun `get 2 as a final position after moving downm`() {

        val result = submarine.dive("down 2")

        Assertions.assertThat(result).isEqualTo(2)
    }

}