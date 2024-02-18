package Chapter4;
import java.util.Scanner;
public class LargestNumber {

    public int collectingNumbers(int... numbers) {
        int counter = 0;
        int largest = numbers[1];
        while (counter < numbers.length) {
            if (numbers[counter] > largest) {
                largest = numbers[counter];


            }
            counter++;
        }
            return largest;

        }


        public int highestNumber ( int...numbers){
            int largest = numbers[1];
            int count = 0;

            while (count < numbers.length) {
                if (numbers[count] > largest) {
                    largest = numbers[count];
                }
                count++;
            }
            return largest;
        }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
LargestNumber largestNumber = new LargestNumber();
//        int count = 0;
//        int value = scan.nextInt();
//        while (count++ <= 10 ){
//            System.out.println("enter a value");
//            value = scan.nextInt();
//
//        }

        int num =largestNumber.collectingNumbers(1,2,3,4,5,6,7,8,9,10);
        System.out.println(num);



    }

}

