package deltadak;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test {@link HelloWorld} class.
 */
public class HelloWorldTest {
    /**
     * Test {@link HelloWorld#calculate()} method.
     */
    @Test
    public void testHelloWorld(){
        fail("test fails");
//        HelloWorld helloWorld = new HelloWorld();
        assertEquals(2, 1+1, "message");
    }
}
