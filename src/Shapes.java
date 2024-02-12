import java.util.Scanner;

public class Shapes {
    //sentinel controlled value
    public static void main(String[] args) {
        Scanner sentinel = new Scanner(System.in);
        int score = 0;
        int totalScore = 0;
        System.out.println("Enter Your Scores or Negative -1 to Stop");
        score = sentinel.nextInt();
        while (score != -1){
            totalScore += score;
            System.out.println("Enter Your Scores or Negative -1 to Stop");
            score = sentinel.nextInt();
        }
        System.out.println("The total score is " + totalScore);
    }
}
