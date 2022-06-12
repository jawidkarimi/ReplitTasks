package variables;
import java.util.Scanner;
public class PatientInformation {
    public static void main(String[] args) {

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city= scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhone = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarid = scan.nextBoolean();

        System.out.println("Patient personal information\nFull name: " +lastName+", " + firstName+ "\nAddress: "
                +street+", "+city+", "+state+" "+zipCode+ "\nContacts: work phone number - "+ workPhone+", personal phone number - "+personalPhone +", email: "+email+ "\nAge: "+age+"\nHeight: " + height+ "\nWeight: "+ weight
                +" pounds\nMarried?: "+ isMarid);
        System.out.println();

    }

}

