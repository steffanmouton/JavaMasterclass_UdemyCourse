package net.blacksheepworks;


class Movie {
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String plot(){
        return "No Plot Here.";
    }
}

class Jaws extends Movie{
    public Jaws()
    {
        super("Jaws");
    }

    public String plot()
    {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay()
    {
        super("Independence Day");
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
