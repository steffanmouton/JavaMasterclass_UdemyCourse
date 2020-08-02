package net.blacksheepworks;

public class BankAccount
{
    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private long phoneNumber;


    public void depositFunds(float amount)
    {
        balance += amount;
        printBalance();
    }

    public void withdrawFunds(float amount)
    {
        // Check for sufficient funds. Return with no change to balance if insufficient.
        if (amount > balance)
        {
            System.out.println("Requested Withdrawal of: " + amount +"\nInsufficient funds. Withdrawal not permitted.");
            printBalance();
            return;
        }

        // If sufficient funds, decrement and return.
        System.out.println("Requested Withdrawal of: " + amount);
        balance -= amount;
        printBalance();
    }

    public void printBalance()
    {
        System.out.println("Balance is: " + balance);
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public void setBalance(float balance)
    {
        this.balance = balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
