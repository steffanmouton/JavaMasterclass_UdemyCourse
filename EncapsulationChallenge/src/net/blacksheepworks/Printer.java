package net.blacksheepworks;

public class Printer
{
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex)
    {
        if (tonerLevel >= 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1; // showing error in toner initialization value
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public Printer()
    {
        this(100, 0, false);
    }

    public void FillToner(int amount)
    {
        tonerLevel += amount;
        if (tonerLevel > 100)
            tonerLevel = 100;

        System.out.println("Toner level is now: " + tonerLevel);
    }

    public int PrintPages(int pages)
    {
        int pagesToPrint = pages;
        if (isDuplex)
            pagesToPrint = pages / 2 + pages % 2;
        pagesPrinted += pagesToPrint;
        System.out.println("Page printed. Number of pages printed to date is: " + pagesPrinted);
        return pagesToPrint;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }
}
