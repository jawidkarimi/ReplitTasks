package StringMethods;
import java.util.Scanner;
public class StartAndEndWith {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.next();

        boolean a= word.startsWith("a");
        System.out.println("Starts with a: " + a);

        boolean e = word.endsWith("e");
        System.out.println("Ends with e: "+ e);

    }
}
