import org.junit.jupiter.api.Test;
import semicolonStuff.AutomaticBike;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void testThatBikeCanBeTurnedOn(){
        AutomaticBike honda = new AutomaticBike();
        honda.powerOn();
        assertTrue(honda.powerOn());
    }
    @Test
public void testThatBikeCanBeTurnedOff(){
        AutomaticBike honda = new AutomaticBike();
        honda.powerOff();
        assertFalse(honda.powerOff());
    }
    @Test
public void testThatBikeCanBeAccelerated(){
        AutomaticBike honda = new AutomaticBike();
        honda.powerOn();
        assertTrue(honda.powerOn());
        assertEquals(1, honda.accelerate());
    }
    @Test
public void testThatBikeCanAccelerateTwice(){
        AutomaticBike honda = new AutomaticBike();
        honda.powerOn();
        assertTrue(honda.powerOn());
        honda.accelerate();
        assertEquals(2, honda.accelerate());
    }

}
