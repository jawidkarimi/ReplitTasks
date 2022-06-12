package StringMethods;
import java.util.Scanner;
public class VerifyEquals {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        boolean isEqual = word1.equals(word2);
        System.out.println(isEqual);

    }
}
