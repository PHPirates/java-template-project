package deltadak;

import javafx.application.Application;
import javafx.scene.control.ProgressIndicator;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 */
public class JavaFXTest extends FxRobot {

//    /**
//     * @throws Exception oh
//     */
//    @Before
//    public void before() throws Exception {
//        FxToolkit.registerPrimaryStage();
//        FxToolkit.setupApplication(HelloJavaFX.class);
//    }

    /**
     *
     */
    @Test
    public void testProgress() throws TimeoutException {
        // Initialise JavaFX.
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(HelloJavaFX.class);

        HelloJavaFX helloJavaFX = new HelloJavaFX();

        ProgressIndicator progressIndicator = new ProgressIndicator();

        assertTrue(helloJavaFX.setLoading(progressIndicator));

        fail("it works!");

    }

}