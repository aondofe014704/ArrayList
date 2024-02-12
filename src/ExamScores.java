import java.util.Scanner;
public class ExamScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 1;

        while (counter <= 10){
            System.out.println("Enter scores:");
            int score = input.nextInt();
            sum += score;
            counter++;
            System.out.println("The total Sum of the scores is: " + sum);
        }


    }
}
