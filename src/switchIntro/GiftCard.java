package switchIntro;
import java.util.Scanner;
public class GiftCard {

    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = input.next();
        while (!(item.equals("Blanket") || item.equals("Charger") ||item.equals("Hat") ||item.equals("Headphones")||item.equals("Laptop")||item.equals("Pants")||
                item.equals("Pillow")||item.equals("Smartphone")||item.equals("Socks")||item.equals("USB cable"))){
            System.out.println("Sorry, that is an invalid item");
            return;
        }
        switch (item){
            case "Blanket":
                System.out.println("Thank you for your purchase!\nYour current balance is: 40$");
                break;
            case "Charger":
                System.out.println("Thank you for your purchase!\nYour current balance is: 95$");
                break;
            case "Hat":
                System.out.println("Thank you for your purchase!\nYour current balance is: 75$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase!\nYour current balance is: 70$");
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase!\nYour current balance is: 50$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase!\nYour current balance is: 60$");
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase!\nYour current balance is: 95$");
                break;
            default:
                System.out.println("Thank you for your purchase!\nYour current balance is: 90$");
                break;
        }
    }
}
