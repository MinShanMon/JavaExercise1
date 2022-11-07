package aabstract;
public abstract class BankAccount {
    // public abstract void monthlyCharge(Sample s);
    public final float CHARGE_AMOUNT = 2;
    public final float MINIMUM = 500;
    private float balance;

    public float getBalance(){
        return balance;
    }

    public void withdraw(float amount){
        balance -= amount;
    }

    public abstract void monthlyCharge();
}


