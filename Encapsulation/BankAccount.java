

class Account
{
    private long balance;
    public long getBalance()
    {
        return this.balance;
    }
    public void setBalance(long balance)
    {
        if (balance>0)
        {
            this.balance=balance;
        }
        else
            {
            System.out.println("Invalid balance");
            }
    }
}

public class BankAccount {
    public static void main(String[] args)
    {
        Account acc=new Account();
        acc.setBalance(100000);
        acc.setBalance(-50000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
