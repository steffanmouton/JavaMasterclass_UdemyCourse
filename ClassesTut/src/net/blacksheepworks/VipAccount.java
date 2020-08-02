package net.blacksheepworks;

public class VipAccount
{
    private String name;
    private int creditLimit;
    private String email;

    public String getName()
    {
        return name;
    }

    public int getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail()
    {
        return email;
    }

    public VipAccount()
    {
        this("DefaultName", 10000, "DefaultEmail");
    }

    public VipAccount(String name, String email)
    {
        this(name, 10000, email);
    }

    public VipAccount(String name, int creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
