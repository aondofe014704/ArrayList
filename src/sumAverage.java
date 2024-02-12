import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 1;
        while (counter <= 10){
            System.out.println("Enter number 1 to 10");
            int number = input.nextInt();
            total += number;
            int sum = total;

            counter++;
            int average = total / counter;

            System.out.println("The average is :" + average);
            System.out.println("The sum of the numbers is: " + sum);

        }

    }
}
