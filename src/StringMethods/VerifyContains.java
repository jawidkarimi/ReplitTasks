package StringMethods;
import java.util.Scanner;
public class VerifyContains {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String sentence = scan.nextLine();

            boolean hasWord = sentence.contains(word);
            System.out.println(hasWord);

        }
    }

