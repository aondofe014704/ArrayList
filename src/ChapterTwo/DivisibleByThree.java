package ChapterTwo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstInteger = scanner.nextInt();
        if(firstInteger % 3 == 0){
            System.out.println("Number is divisible by 3");
        } else {
            System.out.println("Number is not divisible by 3");
        }
    }
}
