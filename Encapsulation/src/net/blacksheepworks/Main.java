package net.blacksheepworks;

public class Main {

    public static void main(String[] args)
    {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Reamining health = " + player.health);

        damage = 11;
        // This is why we use encapsulation. If we can edit an object from outside,
        // things can get real messy.
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Reamining health = " + player.health);
    }
}
