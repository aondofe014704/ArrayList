

public class StackClass {
    private boolean isStackEmpty = true;
    private int numberOfElement;

    public boolean isStackEmpty() {
        if(numberOfElement == 0) return true;
        return false;

    }

    public void push(int number) {
        numberOfElement++;
    }

    public void pop(int number) {
        numberOfElement--;
    }

}
