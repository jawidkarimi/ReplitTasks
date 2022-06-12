package basics;

public class Employee {

    public static void main(String[] args) {
        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int salary = 200000;
        String startDay = "10";
        String startMonth = "1";
        String startYear = "2022";
        boolean isFulltime = true;
        String jobTitle = "SDET";
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";

        String fullName = firstName + lastName;
        String fullSartDate = startDay +
                startMonth + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        int salaryAfterYear = salary + salary*15/100;

        System.out.println ("Employee Information");
        System.out.println ("We have " + firstName +" " + lastName + " joining " + companyName);
        System.out.println(firstName + " will start on " + startMonth + "/" + startDay + "/" + startYear + " as full time: " + isFulltime);
        System.out.println (firstName + " here is some information about your employment");
        System.out.println("Your email is " + email);
        System.out.println("Your base salary is $" + salary + " and " + "after 2 years it will be $" + salaryAfterYear);
        System.out.println("Welcome aboard, see you at " + officeAddress);


    }
}