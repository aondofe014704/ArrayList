package personalDevelopment;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] myArrayList = new int[10];

        for (int i = 0; i < myArrayList.length; i++) {
            myArrayList[i] = i * 10;
            System.out.println(myArrayList[i]);
        }


    }
}
