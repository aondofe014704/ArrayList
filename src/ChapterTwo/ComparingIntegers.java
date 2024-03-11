package ChapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        System.out.println("Enter an Integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberSquare = number * number;
        if(number == numberSquare){
            System.out.printf("%d == %d%n", number, numberSquare);
        }
        if(number != numberSquare){
            System.out.printf("%d != %d%n", number, numberSquare);
        }
        if(number > numberSquare){
            System.out.printf("%d > %d%n", number, numberSquare);
        }
        if(number < numberSquare){
            System.out.printf("%d < %d%n", number, numberSquare);
        }
    }
}
