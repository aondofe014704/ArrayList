public class AirCondition {
    private boolean isOn;
    private int temperature = 16;


    public boolean isOn() {
        return isOn;
    }

    public boolean powerOn() {
        return true;
    }


    public void powerOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        if (temperature >= 16 && temperature < 30) {
            temperature++;
        }


    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if(temperature < 30 && temperature <= 16)
        temperature--;
    }

}