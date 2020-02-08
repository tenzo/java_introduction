package inheritance.bank;

public abstract class AbstractBankAccount {

    protected String owner;
    protected int cashAmount;

    public AbstractBankAccount(String owner, int cashAmount) {
        this.owner = owner;
        this.cashAmount = cashAmount;
    }

    public int withdraw(int amount) {
        int returnAmount = 0;
        if (getMaxAmount() >= amount) {
            cashAmount -= amount;
            returnAmount = amount;
        } else {
            System.out.println("Nie masz wystarczającej kwoty na koncie! Pozostało " + cashAmount);
        }
        return returnAmount;
    }

    protected abstract int getMaxAmount();

    public String getOwner() {
        return owner;
    }

    public int getCashAmount() {
        return cashAmount;
    }
}
