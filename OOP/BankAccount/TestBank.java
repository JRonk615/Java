public class TestBank {
    public static void main(String[] args) {
        System.out.println("null");
        BankAccount user1 = new BankAccount("Jordan Ronk", 2000.00, 10000.00);
        BankAccount mainAccountVault = new BankAccount("Bank Vault", 200000.00, 1000000.00);

        System.out.println(BankAccount.getMemberTotal());
        BankAccount.getBankCashFlow();
        user1.depositChecking(250.00);
        BankAccount.getBankCashFlow();
        user1.depositSavings(18000.98);
        BankAccount.getBankCashFlow();
        user1.withdrawChecking(10000.98);
        user1.withdrawChecking(1000.98);
        BankAccount.getBankCashFlow();
        user1.withdrawSaving(100000.98);
        user1.withdrawSaving(4304.32);
        BankAccount.getBankCashFlow();
        System.out.println("Your total account value is $" + user1.getTotalAmount());







    }
}
