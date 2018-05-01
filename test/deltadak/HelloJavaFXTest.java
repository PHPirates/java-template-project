package deltadak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

//    /**
//     * Fails on `new ProgressIndicator();` line.
//     */
//    @Test
//    public void testProgress() {
//        HelloJavaFX helloJavaFX = new HelloJavaFX();
//
//        // Initialise JavaFX Toolkit, needed for using elements like ProgressIndicator.
//        com.sun.javafx.application.PlatformImpl.startup(()->{});
//
//        ProgressIndicator progressIndicator = new ProgressIndicator();
//
//        assertTrue(helloJavaFX.isLoading(progressIndicator));
//
//        // Shutdown toolkit.
//        com.sun.javafx.application.PlatformImpl.exit();
//    }

}