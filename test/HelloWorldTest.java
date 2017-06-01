import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test {@link HelloWorld} class.
 */
public class HelloWorldTest {
    /**
     * Test {@link HelloWorld#calculate()} method.
     */
    @Test
    public void testHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(2, helloWorld.calculate());
    }
}
