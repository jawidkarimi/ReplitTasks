package StringMethods;
import java.util.Scanner;
public class CaseSensitivity {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.next();

        System.out.println("word: "+word);
        String upperCase = word.toUpperCase();
        System.out.println("uppercase: " + upperCase);
        String lowerCase = word.toLowerCase();
        System.out.println("lowercase: " + lowerCase);


    }
}
