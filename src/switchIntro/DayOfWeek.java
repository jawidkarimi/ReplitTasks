package switchIntro;
import java.util.Scanner;
public class DayOfWeek {

    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }

    }
}
