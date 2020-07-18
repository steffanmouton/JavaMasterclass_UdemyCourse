package net.blacksheepworks;

public class Main {

    public static void main(String[] args) {

        // Create a double variable with value 20.00
        // Create a second variable of type double with the value 80.00
        // Add both numbers then multiply by 100
        // find remainder with 40.00 (modulus)
        // Create boolean that assigns true if remainder is 0
        // Output boolean
        // If-then output "Got some remainder" if step 5 is not true.

        double x = 20.00;
        double y = 80.00;

        double sum = x + y;

        double product = sum * 100;

        double remainder = product % 40.00;

        boolean isRemainderZero = (remainder == 0);

        System.out.println("Is the remainder Zero? " + isRemainderZero);

        if (!isRemainderZero)
        {
            System.out.println("Got some remainder, value of: " + remainder);
        }


        if (!isRemainderZero){
            
        }
    }
}
