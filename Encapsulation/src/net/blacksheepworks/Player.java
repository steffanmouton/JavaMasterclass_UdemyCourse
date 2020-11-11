package net.blacksheepworks;

// First class, to show one non-encapsulated, for comparison.
public class Player
{
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health -= damage;
        if(this.health <= 0)
        {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player.
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
