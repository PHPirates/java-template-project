package deltadak

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KotlinJUnitTest {

    @Test
    fun testKotlinJUnit() {
        val helloWorld = HelloWorld()
        assertEquals(2, helloWorld.calculate(), "message")
    }

}