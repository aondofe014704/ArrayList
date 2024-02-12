package personalDevelopment;

import java.util.SequencedSet;
import java.util.Stack;

public class StackTutorials {
    public static void main(String[] args) {

        Stack<String> nameOfStack = new Stack<String>();
        nameOfStack.push("Mary");
        nameOfStack.push("Jack");
        nameOfStack.push("Peters");
        nameOfStack.push("Martha");
        nameOfStack.push("Austine");
       // System.out.println(nameOfStack.empty());

//        nameOfStack.pop();
//        nameOfStack.pop();
//        nameOfStack.pop();
//        nameOfStack.pop();
//        nameOfStack.pop();
        String brother = nameOfStack.pop();


        System.out.println(brother);
        System.out.println(nameOfStack);

    }

}
