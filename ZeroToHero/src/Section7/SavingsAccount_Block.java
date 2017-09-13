package Section7;

// method syncronization
public class SavingsAccount_Block {
    private float balance;

    public void withdraw(float anAmount){
        if(anAmount < 0.0)
            throw new IllegalArgumentException("Withdraw amount negative.");
        synchronized(this){
            if(anAmount <= balance)
                balance = balance + anAmount;
        }
    }

    public void deposit(float anAmount){
        if(anAmount<0.0)
            throw new IllegalArgumentException("Deposit amount negative.");
        synchronized(this){
            balance = balance + anAmount;
        }
    }
}