import org.junit.jupiter.api.Test;
import semicolonStuff.Person;
import semicolonStuff.Problems;
import semicolonStuff.Type;


import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    @Test
    public void testThatProblemsCanBeAdded(){
        Problems problems = new Problems("schoolFee", Type.FINANCIAL);
        Problems problems1 = new Problems("profitLoss", Type.BUSINESS);
        Problems problems2 = new Problems("lackingTechnicalSkills", Type.TECHNICAL);
        Person.addProblems(problems);
        Person.addProblems(problems1);
        Person.addProblems(problems2);
        assertEquals(3,Person.recountingProblems().size());
    }
    @Test
    public void testThatProblemsCanBeSolved(){
        Problems problems = new Problems("schoolFee", Type.FINANCIAL);
        Person.addProblems(problems);
        Person.solveProblems(problems);
        assertEquals(0, Person.recountingProblems().size());
    }
    @Test
    public void testThatWeCanAddTwoProblemsAndRemoveOne(){
        Problems problems = new Problems("havingEvilDreams",Type.SPIRITUAL);
        Person.addProblems(problems);
        Person.addProblems(problems);
        Person.solveProblems(problems);
        assertEquals(1,Person.recountingProblems().size());

    }

}
