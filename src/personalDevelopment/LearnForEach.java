package personalDevelopment;

import java.util.ArrayList;


public class LearnForEach {
    public static void main(String[] args) {

        ArrayList<String> myList= new ArrayList<>();

         String [] myArray = {"Jackson","chi-chi","Ikechukwu","Solomon","Izunna"};

         myList.add(myArray[1]);
         myList.add(myArray[4]);
         myList.remove(myArray[1]);

         myList.add(myArray[3]);
        int size = myList.size();
        System.out.println(myList);
        System.out.println("list size is: "+ size);

    }
}
