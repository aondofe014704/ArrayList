package ChapterTwo;

import java.util.Scanner;

public class ArithmeticCalculation {
    public static void main(String [] args){
        System.out.println("Enter first integer : ");
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        System.out.println("Enter second integer: ");

        int secondInteger = scanner.nextInt();
        int firstIntegerSquare = firstInteger * firstInteger;
        int secondIntegerSquare = secondInteger * secondInteger;
        System.out.println(firstIntegerSquare);
        System.out.println(secondIntegerSquare);

        int sumOfFirstInteger = firstIntegerSquare * firstIntegerSquare;
        int sumOfSecondInteger = secondIntegerSquare * secondIntegerSquare;
        System.out.println(sumOfFirstInteger);
        System.out.println(sumOfSecondInteger);


        int minusSquares = sumOfFirstInteger - sumOfSecondInteger;
        System.out.println(minusSquares);


    }
}
