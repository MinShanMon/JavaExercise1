package aabstract;

public class CurrentAccount extends BankAccount {
    public void monthlyCharge(){
        withdraw(CHARGE_AMOUNT);
    }
}
