import java.util.ArrayList;

public class Users {
    private String name;
    private ArrayList<Item> accounts;

    public void BankAccount(String name){
        this.name = name;
        this.accounts = new ArrayList<Item>();
    }
}
