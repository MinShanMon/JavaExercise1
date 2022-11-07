package aabstract;

public class SavingAccount extends BankAccount {
    public void monthlyCharge(){
        if(getBalance()<MINIMUM){
            withdraw(CHARGE_AMOUNT);
        }
    }
}
