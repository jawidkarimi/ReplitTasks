package StringMethods;
import java.util.Scanner;
public class Email {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName;
        String lastName;
        String domain;

        firstName = email.substring(0, email.indexOf('_'));
        lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        domain = domain.substring(0, 1).toUpperCase() + domain.substring(1).toLowerCase();

        System.out.println("First name: "+firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


    }
}
