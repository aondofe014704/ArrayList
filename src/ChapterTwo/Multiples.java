package ChapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an first Integer");
        int firstInteger =  scanner.nextInt();
        System.out.println("Enter an second Integer");
        int secondInteger = scanner.nextInt();
        int tripleOfFirstInteger = firstInteger * firstInteger * firstInteger;
        int doubleOfSecondInteger = secondInteger * secondInteger;
        if(tripleOfFirstInteger % doubleOfSecondInteger == 0){
            System.out.println("The first integer tripled is a multiple of the second number doubled ");
        }else {
            System.out.println("The first integer tripled is not a multiple of the second number doubled ");
        }


    }
}
