package net.blacksheepworks;

public class Main {

    public static void main(String[] args)
    {
//  Here is the old code using the non-encapsulated class.
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.health);
//
//        damage = 11;
//        // This is why we use encapsulation. If we can edit an object from outside,
//        // things can get real messy.
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.health);

        // New class created and accessed only thru getters/constructors and other
        // methods that belong to that class. Encapsulation.
        EnhancedPlayer player = new EnhancedPlayer("tim", 50, "Sword");
        System.out.println("Initial Health is " + player.getHealth());
    }
}
