package StringMethods;
import java.util.Scanner;
public class ReverseIt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.length() < 5) {
                System.out.println("Too short!");
                return;
            }

            if (word.length() > 5) {
                System.out.print("Too long!");
                break;
            }
            char each = word.charAt(i);
            result += each;
        }

        System.out.println(result);
    }
}
