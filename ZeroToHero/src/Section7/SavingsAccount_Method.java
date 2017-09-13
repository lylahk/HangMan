package Section7;

// method syncronization
public class SavingsAccount_Method {
    private float balance;

    public synchronized void withdrawl(float anAmount){
        if((anAmount>0.0)&&(anAmount<=balance))
            balance = balance - anAmount;
    }

    public synchronized void deposit(float anAmount){
        if(anAmount>0.0)
            balance = balance + anAmount;
    }
}
