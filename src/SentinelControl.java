import java.util.Scanner;

public class SentinelControl {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int score = 0;
        int totalScore = 0;
        System.out.println("Enter scores or - 1 to Quit ");
        while (score != -1){
            totalScore += score;
            System.out.println("Enter scores or - 1 to Quit ");
            score = demo.nextInt();

        }
        System.out.println("The total score is " + totalScore);
    }

}
