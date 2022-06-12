package StringMethods;
import java.util.Scanner;
public class MiddleCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.print(middle(word));
    }
    public static String middle(String word) {
        int middle;
        int length;
        if (word.length() % 2 == 0) {
            middle = word.length() / 2 - 1;
            length = 2;
        }
        else
        {
            middle = word.length() / 2;
            length = 1;
        }
        return word.substring(middle, middle + length);
    }
}
