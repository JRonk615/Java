public class Greeting {
    public static void main(String[] args) {

        GreetingMethods messageApp = new GreetingMethods();

        String dateMessage = messageApp.getCurrentDate();
        String welcomeMessage = messageApp.greetEnglish("Jordan");
        System.out.println(dateMessage);
        System.out.println(welcomeMessage);
    }
}