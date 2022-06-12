package variables;
import java.util.Scanner;
public class SecondConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();

        int sec = inputSeconds % 60;

        int minute = (inputSeconds/60)%60;

        int hour = (inputSeconds/60)/60;

        System.out.println(hour +" hours, " + minute + " minutes, and " + sec +" seconds ");

    }
}
