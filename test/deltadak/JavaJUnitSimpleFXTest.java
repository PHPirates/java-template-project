package deltadak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests {@link HelloJavaFX} class.
 */
class JavaJUnitSimpleFXTest {

    /**
     * Test {@link HelloJavaFX#calculate()} method.
     */
    @Test
    public void testCalculate(){
        HelloJavaFX helloJavaFX = new HelloJavaFX();

        assertEquals(2, helloJavaFX.calculate(), "message");
    }

}