package StringMethods;
import java.util.Scanner;
public class FindTheLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        int digits = word.length();
        System.out.print(digits);

    }
}
