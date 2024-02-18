package problemReflection;

import java.util.List;

public class Persons {
    private List<Problems>problemsList;
    public void addProblems(Problems problems){
        problemsList.add(problems);
        problemsList.add(problems);
        problemsList.add(problems);

    }
    public void tellProblems(){
        for (Problems problem: problemsList){
            problem.isSolved();

        }
    }
}
