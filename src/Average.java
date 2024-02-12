import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Enter Scores");
            int scores = scanner.nextInt();
            total += scores;
            counter++;

            int average = total / counter;
            System.out.println("The Average is: " + average);
        }

        }
    }

