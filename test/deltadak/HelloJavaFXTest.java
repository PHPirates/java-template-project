package deltadak;

import javafx.scene.control.ProgressIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests {@link HelloJavaFX} class.
 */
class HelloJavaFXTest {

    /**
     * Test {@link HelloJavaFX#calculate()} method.
     */
    @Test
    public void testCalculate(){
        HelloJavaFX helloJavaFX = new HelloJavaFX();

        assertEquals(2, helloJavaFX.calculate(), "message");
    }

    @Test
    public void testProgress() {
        HelloJavaFX helloJavaFX = new HelloJavaFX();
        ProgressIndicator progressIndicator = new ProgressIndicator();

        assertTrue(helloJavaFX.setLoading(progressIndicator));
    }

}