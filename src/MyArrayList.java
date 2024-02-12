public class MyArrayList {
    private boolean isEmpty = true;
    private int numberOfItems;

    public boolean isEmpty() {
        if(numberOfItems == 0)return true;
        return false;
    }

    public void add(String item) {
        numberOfItems++;
    }

    public void remove(String item) {
        if(numberOfItems == 0)throw new IllegalArgumentException("empty list");
        numberOfItems--;


    }
}
