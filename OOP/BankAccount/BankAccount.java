public class BankAccount {
    private String accountHolder;
    private double checkingBalance;
    private double savingsBalance;
    private static int members = 0;
    private static double liquidAssets = 0;

    public BankAccount(String user, double checking, double savings){
        this.accountHolder = user;
        this.checkingBalance = checking;
        this.savingsBalance = savings;
        members++;
        liquidAssets = liquidAssets + checking + savings;
    }
    
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositChecking(double amount) {
        this.checkingBalance = this.checkingBalance + amount;
        liquidAssets = liquidAssets + amount;
    }

    public void depositSavings(double amount) {
        this.savingsBalance = this.savingsBalance + amount;
        liquidAssets = liquidAssets + amount;
    }

    public void withdrawChecking(double amount) {
        if(amount < this.checkingBalance) {
            this.checkingBalance = this.checkingBalance - amount;
            liquidAssets = liquidAssets - amount;
            System.out.println("Your account balance is now: $" + checkingBalance);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

    public void withdrawSaving(double amount) {
        if(amount < this.savingsBalance) {
            this.savingsBalance = this.savingsBalance - amount;
            liquidAssets = liquidAssets - amount;
            System.out.println("|                                                        |");
            System.out.println("|                                                        |");
            System.out.print("|------------ Welcome to Ninja Credit Union -------------|\n");
            System.out.println("|                                                        |");
            System.out.println("|                                                        |");
            System.out.println("|-------------Your account balance is now: $" + savingsBalance);
            System.out.println("|                                                        |");
            System.out.println("|                                                        |");
        }
        else {
            System.out.println("|                                                        |");
            System.out.println("|                                                        |");
            System.out.print("|------------ Welcome to Ninja Credit Union -------------|\n");
            System.out.println("|                                                        |");
            System.out.println("|                                                        |");
            System.out.println("|-----------Insufficient funds-------------------------|");
        }

    }

    public double getTotalAmount() {
        double total = checkingBalance + savingsBalance;
        System.out.print("|------------ Welcome to Ninja Credit Union -------------|\n");
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");
        System.out.println("|------------ Your current Assets are: $" + total);
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");
        System.out.print("----------------------------------------------------------\n");
        return total;
    }

    public static int getMemberTotal() {
        return members;
    }

    public static double getBankCashFlow(){
        System.out.print("|------------ Welcome to Ninja Credit Union -------------|\n");
        System.out.println("|-------------Current Banks Liqiud Assets are: $" + liquidAssets);
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");
        System.out.println("|                                                        |");

        return liquidAssets;
    }
}
