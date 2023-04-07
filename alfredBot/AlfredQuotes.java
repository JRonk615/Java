import java.util.Date;

public class AlfredQuotes {
    public String initialGreeting() {
        return "Hello Mister Wayne. How may I assist you today?";
    }
    public String guestGreeting(String name) {
        return String.format("Hello %s, are you here to see Mister Wayne?", name);
    }
    public String getCurrentDate() {
        Date date = new Date();
        return "The date is currently " + date;
    }
    public String answerBeforeAlexis(String response) {
        if(response.indexOf("Alexis") > -1) {
            return "Im sorry but if you dont mind i will be handling an problems you may have. She is more of a bother than any help!";
        }
        else if(response.indexOf("Alfred") > -1) {
            return "Ahh yes... as you wish sir.";
        }
        else if {
            return "Im sorry but if you need something of me please address me politely by name if you may.";
        }
    }
}