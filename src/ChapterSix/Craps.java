//package ChapterSix;
//import java.security.SecureRandom;
//public class Craps {
//  private static final SecureRandom secureRandom = new SecureRandom();
//  private enum Status{CONTINUE, WON, LOST};
//  private static final int SNAKE_KEYS = 2;
//    private static final int TREY = 3;
//    private static final int SEVEN = 7;
//    private static final int YO_LEVEN = 11;
//    private static final int BOX_CARS = 12;
//
//    public static void main(String[] args){
//        int myPoint = 0;
//        Status gameStatus;
//        int sumOfDice = rollDice();
//    }
//    switch(sumOfDice){
//        case SEVEN:
//        case YO_LEVEN:
//            gameStatus = Status.WON;
//            break;
//        case SNAKE_KEYS:
//        case TREY:
//        case BOX_CARS:
//            gameStatus = Status.LOST;
//            break;
//
//        default:
//    gameStatus = Status.CONTINUE;
//    myPoint = sumOfDice;
//            System.out.printf("Point is %d%n", myPoint);
//            break;
//    }
//while(gameStatus == Status.CONTINUE){
//    sumOfDice = rollDice();
//    if(sumOfDice == myPoint){
//        gameStatus.WON;
//    }
//    else{
//        if(sumOfDice == SEVEN){
//            gameStatus = Status.LOST;
//            }
//        }
//    }
//if(gameStatus == Status.WON){
//        System.out.println("Player wins");
//    }
//else{
//        System.out.println("Player loses");
//    }
//
//
//    public static int rollDice() {
//        int dieOne = 1 + secureRandom.nextInt(6);
//        int dieTwo = 1 + secureRandom.nextInt(6);
//        int sum = dieOne + dieTwo;
//        System.out.printf("Player rolled %d + %d = %d%n", dieOne, dieTwo, sum);
//        return sum;
//    }
//}
//
