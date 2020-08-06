package net.blacksheepworks;

public class PC
{
    private Case theCase;
    private Motherboard mobo;
    private Monitor monitor;

    public PC(Case theCase, Motherboard mobo, Monitor monitor)
    {
        this.theCase = theCase;
        this.mobo = mobo;
        this.monitor = monitor;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        // Complicated graphics things
        monitor.drawPixelAt(1200, 50, "blue");
    }

}
