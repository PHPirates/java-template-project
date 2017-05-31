import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testHellowWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.calculate(), 2);
    }
}
