package net.blacksheepworks;

public class Main {

    public static void main(String[] args) {

        // Create a variable to store the number of pounds to be converted.
        // Calculate the result (# of Kg) and store it in a 2nd appropriate variable.
        // 1 lb = .45359237 Kg

        double pounds;
        double kilos;

        // I tried to get clever and take in input here. Got a NullPointerException. According to internet, the console
        // class throws exceptions if no actual "device" is found, such as when running in IDE. Good to know.
        /*
        System.out.println("Please input weight in pounds.");
        var inputVal = System.console().readLine();
        */


        pounds = 200d;
        System.out.println("Weight to check in pounds: " + pounds);

        kilos = .45359237 * pounds;
        System.out.println("This weight in kilograms is: " + kilos);
    }
}
