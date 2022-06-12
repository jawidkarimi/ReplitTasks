package StringMethods;
import java.util.Scanner;
public class FistAndLastChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstLetter = word.charAt(0);
        System.out.print(firstLetter);
        char lastLetter = word.charAt(word.length()-1);
        System.out.print(lastLetter);

    }
}

