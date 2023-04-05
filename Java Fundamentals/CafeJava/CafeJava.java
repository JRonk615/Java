public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffee = 4.25;
        double latte = 3.75;
        double  cappucino = 4.50;

        String order1 = String.format("Your total is $%s", dripCoffee);
        String order2 = String.format("Your total is $%s", cappucino);
        String order3 = String.format("Your change is $%s", dripCoffee - latte);
        String order4 = String.format("Your total is $%s", latte + latte);



        
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        isReadyOrder1 = true;
        if (isReadyOrder1) {
            System.out.println(readyMessage);
            System.out.println(order1);
        }
        else {
            System.out.println(pendingMessage);
            
        }

        System.out.println(generalGreeting + customer2);
    	
        isReadyOrder2 = true;
        if (isReadyOrder2) {
            System.out.println(readyMessage);
            System.out.println(order2);
        }
        else {
            System.out.println(pendingMessage);
            
        }

        System.out.println(generalGreeting + customer4);
    	
        isReadyOrder4 = true;
        if (isReadyOrder4) {
            System.out.println(readyMessage);
            System.out.println(order4);
        }
        else {
            System.out.println(pendingMessage);
            
        }

        System.out.println(generalGreeting + customer3);
    	
        isReadyOrder3 = true;
        if (isReadyOrder3) {
            System.out.println(readyMessage);
            System.out.println(order3);
        }
        else {
            System.out.println(pendingMessage);
            
        }
    }
}
