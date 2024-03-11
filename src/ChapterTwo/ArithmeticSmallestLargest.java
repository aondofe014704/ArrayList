package ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Integer");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third Integer");
        int thirdNumber = scanner.nextInt();
        int sumOfAllIntegers = firstNumber + secondNumber + thirdNumber;
        System.out.println(sumOfAllIntegers);
        int averageOfAllIntegers = firstNumber + secondNumber + thirdNumber / 3;
        System.out.println(averageOfAllIntegers);
        int productOfAllIntegers = firstNumber * secondNumber * thirdNumber;
        System.out.println(productOfAllIntegers);
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The highest number is: " + firstNumber);
        }
        if(secondNumber > thirdNumber && secondNumber > firstNumber){
            System.out.println("The highest number is: " + secondNumber);
        }
        if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("The highest number is: " + thirdNumber);
        }

        if(firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.println("The highest number is: " + firstNumber);
        }
        if(secondNumber < thirdNumber && secondNumber < firstNumber){
            System.out.println("The highest number is: " + secondNumber);
        }
        if(thirdNumber < firstNumber && thirdNumber < secondNumber){
            System.out.println("The highest number is: " + thirdNumber);
        }

    }
}
