import java.util.ArrayList;


public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = i + sum;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> items) {
        for (int i = 0; i < items.size() -1; i++) {
            System.out.printf("%s %s \n", i, items.get(i));
        }
    }

    void addCustomer(ArrayList<String> people) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.printf("There are %s people(s) in front of you", people.size());
        people.add(userName);
    }
}