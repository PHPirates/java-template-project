package deltadak;

import javafx.scene.control.ProgressIndicator;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;

import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test general JavaFX components.
 */
public class JavaFXTest extends FxRobot {

    /**
     * Tests that testing JavaFX components works.
     *
     * @throws TimeoutException When initialising JavaFX times out.
     */
    @Test
    public void testProgress() throws TimeoutException {
        // Initialise JavaFX.
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(HelloJavaFX.class);

        HelloJavaFX helloJavaFX = new HelloJavaFX();

        ProgressIndicator progressIndicator = new ProgressIndicator();

        assertTrue(helloJavaFX.isLoading(progressIndicator));

    }

}