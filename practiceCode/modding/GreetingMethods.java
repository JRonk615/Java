import java.util.Date;

class GreetingMethods {

    public String getCurrentDate() {
        Date date = new Date();
        return "The date is currently " + date;
    }

    public String greetEnglish(String name) {
        return "Hello, " + name;
    }
}