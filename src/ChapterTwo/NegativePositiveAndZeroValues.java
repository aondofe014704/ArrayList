package ChapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number :");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter fourth number :");
        int fourthNumber = scanner.nextInt();
        System.out.println("Enter fifth number");
        int fifthNumber = scanner.nextInt();
        if(firstNumber > 0){
            System.out.println("number is positive" + firstNumber  );
        } else if (firstNumber < 0) {
            System.out.println("number is negative" + firstNumber  );
        }else {
            System.out.println("number is zero" + firstNumber  );
        }
        if(secondNumber > 0){
            System.out.println("number is positive" + secondNumber  );
        } else if (secondNumber < 0) {
            System.out.println(" number is negative" + secondNumber  );
        }else {
            System.out.println("number is zero" + secondNumber  );
        }
        if(thirdNumber > 0){
            System.out.println("number is positive " + thirdNumber  );
        } else if (thirdNumber < 0) {
            System.out.println("number is negative" + thirdNumber  );
        }else {
            System.out.println("number is zero");
        }
        if(fourthNumber > 0){
            System.out.println("number is positive" + fourthNumber  );
        } else if (fourthNumber < 0) {
            System.out.println("number is negative" + fourthNumber  );
        }else {
            System.out.println("number is zero" + fourthNumber  );
        }
        if(fifthNumber > 0){
            System.out.println("number is positive" + fifthNumber  );
        } else if (fifthNumber < 0) {
            System.out.println("number is negative" + fifthNumber  );
        }else {
            System.out.println("number is zero" + fifthNumber  );
        }


    }
}
