package ChapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        int bmiConstant = 703;
        System.out.println("please enter your weight in pounds");
        Scanner scanner = new Scanner(System.in);
        double weightInPounds = scanner.nextDouble();
        System.out.println("please enter your height in inches");
        double heightInInches = scanner.nextDouble();
        double result = weightInPounds * bmiConstant / heightInInches * heightInInches;
        System.out.println("Your BMI is " + result);

// or this way round.............

        System.out.println("Enter your weight in kilograms");
        double weightInKilograms = scanner.nextDouble();
        System.out.println("Enter your weight in kilograms");
        double heightInMeters = scanner.nextDouble();

        double bmiResult = weightInKilograms / heightInMeters * heightInMeters;
        System.out.println("Your BMI result is " + bmiResult);

        }
    }

