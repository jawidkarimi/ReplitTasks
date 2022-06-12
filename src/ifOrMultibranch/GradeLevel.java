package ifOrMultibranch;
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        if (age < 3){
            System.out.println("ineligible");
        }else if (age < 5){
            System.out.println("preschool");
        }else if (age == 5){
            System.out.println("kindergarten");
        }else if (age < 11){
            System.out.println("elementary school");
        }else if (age < 14){
            System.out.println("middle school");
        }else if (age < 19){
            System.out.println("high school");
        }else{
            System.out.println("college");

        }
    }
}
