package net.blacksheepworks;

public class Main
{
    public static void main(String[] args)
    {
        Dimensions caseDimensions = new Dimensions(1, 4, 4);
        Case theCase = new Case("220B", "ThermalTake", "Corsair 880", caseDimensions);

        Monitor theMonitor = new Monitor("17144", "BenQ", 24, new Resolution(1920, 1080));

        Motherboard theMobo = new Motherboard("A-200", "DigitalStorm", 4, 2, "v2.44");

        PC myPC = new PC(theCase, theMobo, theMonitor);

        myPC.powerUp();



    }
}
