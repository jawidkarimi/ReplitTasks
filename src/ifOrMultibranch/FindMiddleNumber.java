package ifOrMultibranch;
import java.util.Scanner;
public class FindMiddleNumber {

    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        boolean firstIsMid = num1<num3 && num1>num2 || num1>num3 && num1<num2;
        boolean secondIsMid = num2<num3 && num2>num1 || num2>num3 && num2<num1;
        boolean thirdIsMid = num3<num1 && num3>num2 || num3>num1 && num3<num2;

        if(firstIsMid){
            System.out.println("Middle number is: " + num1);
        }
        if(secondIsMid){
            System.out.println("Middle number is: " + num2);
        }
        if(thirdIsMid){
            System.out.println("Middle number is: " + num3);
        }
        input.close();
    }
}
