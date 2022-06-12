package StringMethods;
import java.util.Scanner;
public class WithOutFirstAndLastChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String withoutFirst = word.substring(1, word.length());
        System.out.println("without first letter: "+withoutFirst);
        String withoutLast = word.substring(0,word.length()-1);
        System.out.println("without last letter: "+withoutLast);
    }
}

