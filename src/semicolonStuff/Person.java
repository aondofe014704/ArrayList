package semicolonStuff;

import java.util.ArrayList;
import java.util.List;

public class Person {

   private static List<Problems> problemsList = new ArrayList<Problems>();
    public static void addProblems(Problems problem){
        problemsList.add(problem);

    }
    public static void solveProblems(Problems problem){
        problemsList.remove(problem);

    }
    public static List recountingProblems(){
        return problemsList;
    }
}
