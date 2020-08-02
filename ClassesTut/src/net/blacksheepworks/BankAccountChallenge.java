package net.blacksheepworks;

public class BankAccountChallenge
{
    /*
    Create a new class for a bank account
    Create fields for the account number, balance, customer name, email and phone number

    Create getters and setters for each field
    create two additional methods
    1. to allow the customer to deposit funds (This should increment the balance field)
    2. to allow the customer to withdraw funds (This should decrement the balance field), but not allow the withdrawal
        if there are insufficient funds.
    You will want to create various code in the main class to confirm your code is working
    Add some sout in the two methods above as well.

    Steffan Note: Previous commit used no constructors. Implementing them now as per instruction in tutorial.

    */
    public void run()
    {
        // Initialize account. Set balance. Print balance.
        BankAccount acc = new BankAccount(12345, 1000, "Steffan M",
                "stefemail@email.com",3450958321L);
        acc.printBalance();

        // Deposit Cash
        acc.depositFunds(125);

        // Withdraw Cash (insufficient)
        acc.withdrawFunds(2000);

        // Withdraw Cash (sufficient)
        acc.withdrawFunds(1000);
    }
}
