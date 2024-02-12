import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionTest {
    @Test
    public void testThatTheAirConditionerIsOn() {
        AirCondition airCondition = new AirCondition();
        airCondition.powerOn();
        assertFalse(airCondition.isOn());
    }
    @Test
    public void testThatTheAirConditionerIsOff(){
        AirCondition airCondition = new AirCondition();
        airCondition.powerOff();
        assertFalse(airCondition.isOn());
    }
    @Test
    public  void testThatTemperatureCanIncrease() {
        AirCondition airCondition = new AirCondition();
        airCondition.increaseTemperature();
        assertEquals(17,airCondition.getTemperature());
    }
    @Test
    public void testThatTemperatureCanDecrease(){
        AirCondition airCondition = new AirCondition();
        airCondition.increaseTemperature();
        airCondition.decreaseTemperature();
        assertEquals(17,airCondition.getTemperature());
    }
    @Test
    public void testThatTemperatureCannotGoBeyondThirty(){
        AirCondition airCondition = new AirCondition();
        for(int index = 0; index <= 30; index++){
        airCondition.increaseTemperature();
        }
        assertEquals(30,airCondition.getTemperature());
    }
@Test
    public void testThatAirConditionTemperatureCannotGoBeyondSixteen(){
        AirCondition airCondition = new AirCondition();
        for(int index = 30; index <= 16; index--){
        }
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());

}


}