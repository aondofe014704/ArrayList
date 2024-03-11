package ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Integer");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third Integer");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter fourthInteger");
        int fourthNumber = scanner.nextInt();
        System.out.println("Enter fifth Integer");
        int fifthNumber = scanner.nextInt();
        if(firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){
            System.out.println("The Highest Integer is " + firstNumber);
        }
        if(secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber && secondNumber > firstNumber){
            System.out.println("The Highest Integer is " + secondNumber);
        }
        if(thirdNumber > fourthNumber && thirdNumber > fifthNumber && thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("The Highest Integer is " + thirdNumber);
        }
        if(fourthNumber > fifthNumber && fourthNumber > thirdNumber && fourthNumber > secondNumber && fourthNumber > firstNumber){
            System.out.println("The Highest Integer is " + fourthNumber);
        }
        if(fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber){
            System.out.println("The Highest Integer is " + fifthNumber);
        }

        if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){
            System.out.println("The Lowest Integer is " + firstNumber);
        }
        if(secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber && secondNumber < firstNumber){
            System.out.println("The Lowest Integer is " + secondNumber);
        }
        if(thirdNumber < fourthNumber && thirdNumber < fifthNumber && thirdNumber < firstNumber && thirdNumber < secondNumber){
            System.out.println("The Lowest Integer is " + thirdNumber);
        }
        if(fourthNumber < fifthNumber && fourthNumber < thirdNumber && fourthNumber < secondNumber && fourthNumber < firstNumber){
            System.out.println("The Lowest Integer is " + fourthNumber);
        }
        if(fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){
            System.out.println("The Lowest Integer is " + fifthNumber);
        }


    }
}
