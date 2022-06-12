package ifOrMultibranch;
import java.util.Scanner;
public class Grades {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        String result = "";

        if (grade >= 90) {
            result = "excellent";
        }
        if (grade >= 70 && grade <= 90) {
            result = "good";
        }
        if (grade >= 60 && grade <= 70) {
            result = "pass";
        }
        if (grade < 60) {
            result = "fail";
        }
        System.out.println(result);
    }
}
