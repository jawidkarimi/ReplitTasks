package StringMethods;
import java.util.Scanner;
public class Alejandro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        String email1 = email.toLowerCase();
        boolean containsName = email1.contains("alejandro");
        boolean containsProject = email1.contains("project");


        if(containsName && containsProject){
            System.out.println("priority");
        }
        if(containsName && !containsProject){
            System.out.println("read");
        }
        if(!containsName && !containsProject){
            System.out.println("don't read");
        }
    }

}
