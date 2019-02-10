package deltadak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test {@link HelloWorld} class.
 */
public class HelloWorldTest {
    /**
     * Test {@link HelloWorld#calculate()} method.
     */
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(2, helloWorld.calculate(), "message");
    }
}
