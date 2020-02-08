package inheritance.bank;

public class Test {

    public static void main(String[] args) {
        AbstractBankAccount account = new StandardBankAccount("Paweł", 200);
        System.out.println("Pobrałem " + account.withdraw(50) + "zł, pozostało " + account.getCashAmount());
        System.out.println("Pobrałem " + account.withdraw(30) + "zł, pozostało " + account.getCashAmount());
        System.out.println("Pobrałem " + account.withdraw(90) + "zł, pozostało " + account.getCashAmount());
        System.out.println("Pobrałem " + account.withdraw(70) + "zł, pozostało " + account.getCashAmount());
        System.out.println("Pobrałem " + account.withdraw(50) + "zł, pozostało " + account.getCashAmount());
        System.out.println("Pobrałem " + account.withdraw(30) + "zł, pozostało " + account.getCashAmount());
    }

}
