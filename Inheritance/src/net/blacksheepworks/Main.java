package net.blacksheepworks;

public class Main {

    public static void main(String[] args)
    {
	Dog doggo = new Dog("Gator", 12,45, 2, 4, 1, 32, "Short");
	doggo.eat();

	Fish fishy = new Fish("Blub",2, 3, 2, 2, 6);
	fishy.swim(10);

    }
}
