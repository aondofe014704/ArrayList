package DispatchSnacks;

public class DispatchRiders {
    public static int percentageCalculator(int numberOfSuccessfulDelivery){
        if(numberOfSuccessfulDelivery < 0){
            throw new IllegalArgumentException("Invalid Input");
        } else if (numberOfSuccessfulDelivery <= 50) {
            return numberOfSuccessfulDelivery * 160 + 5000;
        } else if (numberOfSuccessfulDelivery <= 59) {
            return numberOfSuccessfulDelivery * 200 + 5000;
        } else if (numberOfSuccessfulDelivery <= 69) {
            return numberOfSuccessfulDelivery * 250 + 5000;
        } else if (numberOfSuccessfulDelivery >= 70) {
            return numberOfSuccessfulDelivery * 500 + 5000;
        }

        return numberOfSuccessfulDelivery;
    }

    public static void main(String[] args) {
        try {
            System.out.println(DispatchRiders.percentageCalculator(-60));
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }


    }

}
