package semicolonStuff;

public class AutomaticBike {
    private int speedOmeter;
    public boolean powerOn() {
            return true;
    }
    public boolean powerOff() {
        return false;
    }

    public int accelerate() {
        if (speedOmeter >= 0 && speedOmeter <21 ){
            speedOmeter++;
        }
        if (speedOmeter >= 21 && speedOmeter < 31){
            speedOmeter+=2;
        }
        if (speedOmeter >= 31 && speedOmeter < 41){
            speedOmeter+=3;
        }
        if (speedOmeter >41){
            speedOmeter+=3;
        }
            return speedOmeter;
    }


















    //    public int accelerate() {
//        return speedOmeter+=2;
//    }
}
