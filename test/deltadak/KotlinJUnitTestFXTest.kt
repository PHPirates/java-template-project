package deltadak

import javafx.scene.control.ProgressIndicator
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.testfx.api.FxToolkit
import java.util.concurrent.TimeoutException

class KotlinJUnitTestFXTest {

    /**
     * Tests that testing JavaFX components works.
     *
     * @throws TimeoutException When initialising JavaFX times out.
     */
    @Test
    @Throws(TimeoutException::class)
    fun testKtJUnitTestFX() {
        // Initialise JavaFX.
        FxToolkit.registerPrimaryStage()
        FxToolkit.setupApplication(HelloJavaFX::class.java)

        val helloJavaFX = HelloJavaFX()

        val progressIndicator = ProgressIndicator()

        assertTrue(helloJavaFX.setLoading(progressIndicator))

    }

}