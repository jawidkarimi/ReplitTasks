package StringMethods;
import java.util.Scanner;
public class BadWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String replace = word.replaceFirst("dumb", "cool");
        System.out.println(replace);

    }
}
