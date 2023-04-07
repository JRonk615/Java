import java.util.Scanner;

public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String initialGreeting = alfredBot.initialGreeting();
        String guestGreeting = alfredBot.guestGreeting("Jordan");
        String getDate = alfredBot.getCurrentDate();
        String alexisTest = alfredBot.answerBeforeAlexis("Alexis! what is the weather?");
        String alfredTest = alfredBot.answerBeforeAlexis("Alfred, could you read me my emails?");
        String alfredOptional = alfredBot.answerBeforeAlexis("Start my coffe!!!");
        // System.out.println(initialGreeting);
        // System.out.println(guestGreeting);
        // System.out.println(getDate);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        // System.out.println(alfredOptional);

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        String greeting = initialGreeting;
        do {
            System.out.println(greeting);
            String command = input.nextLine();
            if(command.indexOf("Alfred") > -1) {
                switch(command) {
                    case "Alfred what is the date?":
                        System.out.println(getDate);
                        greeting = "How else my i assist you?";
                        break;
                    
                    case "Alfred will you greet our guest?":
                        Scanner guestInput = new Scanner(System.in);
                        System.out.println("What is our guests name?");
                        String guest = guestInput.nextLine();
                        switch(guest){
                            default:
                            System.out.println("Hello there " + guest);
                            greeting = "How else my i assist you?";
                            
                        }
                        break;
    
                    case "Alfred thanks for your help":
                        System.out.println("You are very welcome sir. Good day.");
                        quit = true;
                        break;
    
                    default: 
                        System.out.println(greeting);
                }
                
            }
            else if(command.indexOf("Alexis") > -1) {
                System.out.println("Im sorry but if you dont mind i will be handling any problems you may have. She is more of a bother than any help!");
                greeting = "Now... How may I assist you?";
            }

            else {
                System.out.println("Im sorry but i can only answer if i am called by name first.I dont answer to rudeness");
                greeting = "Now.. politely. How may i help you?";
            }
            
        } 
        while (!quit);

    }
}