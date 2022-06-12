package StringMethods;

import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            String order = s.next();

            if (order.equals("burger")) {
                System.out.println("Your total is $12.50");
            } else if(order.equals("chicken")){
                System.out.println("Your total is $9.75");
            }else{
                System.out.println("Invalid order");
            }
        }
    }
