package basics;

public class PlaneTicket {

    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;

        double result = basePrice+milesBetweenCities/rate;

        System.out.println("The ticket price from " + cityOne + " to " + cityTwo + " is " +"$" + result);


    }
}
