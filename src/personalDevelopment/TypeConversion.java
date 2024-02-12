package personalDevelopment;

public class TypeConversion {
    public static void main(String[] args) {
        byte bee = 127;
        int nee = bee;
        int n = 9;
        int result = 0;
        if(n % 2==0 )
            result = 10;
        else
            result = 20;
        //switch statement
        int day = 7;
        switch (day){
            case 1:
            System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday ");
                break;
            default:
                System.out.println("Day not Found");
                break;

        }

        System.out.println(result);
        System.out.println(nee);
    }


}
