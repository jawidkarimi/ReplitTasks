package switchIntro;
import java.util.Scanner;
public class ComputerBuilder {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = myInput.nextLine();
        System.out.println("Select CPU type:");
        String cpuType = myInput.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = myInput.nextInt();
        myInput.nextLine();
        System.out.println("Select storage type:");
        String storageType = myInput.nextLine();
        System.out.println("Select storage size:");
        int storageSize = myInput.nextInt();
        myInput.nextLine();
        System.out.println("Select screen resolution:");
        String screenType = myInput.nextLine();
        double finalPrice = (ramSize/4*50);

        switch (screenSize){
            case "13.3":
                finalPrice+=200;
                break;
            case "15.0":
                finalPrice+=300;
                break;
            case "17.3":
                finalPrice+=400;
                break;
        }
        switch (cpuType){
            case "i3":
                finalPrice+=150;
                break;
            case "i5":
                finalPrice+=250;
                break;
            case "i7":
                finalPrice+=350;
                break;
        }
        switch (storageType) {
            case "HDD":
                finalPrice += storageSize / 500 * 50;
                break;
            case "SSD":
                finalPrice += storageSize / 500 * 100;
                break;
        }
        switch (screenType) {
            case "FULLHD":
                finalPrice += 100;
                break;
            case "4K":
                finalPrice += 200;
                break;
        }

        System.out.println("Final price is: $"+finalPrice);
    }

}
