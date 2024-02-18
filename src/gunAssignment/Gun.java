package gunAssignment;

public class Gun {
    private String name = "6-roundsSilencer";
    private String model = "AK47Call991";
    private boolean isCocked;
    private int bullets;

    public String hasName() {
        return name;
    }

    public String hasModel() {
        return model;
    }

    public boolean isCocked() {
        return false;
    }

    public boolean cocked() {
        return true;
    }

    public int addBullets() {
        return bullets++;
    }

    public int shoot() {
        return bullets--;
    }

}
