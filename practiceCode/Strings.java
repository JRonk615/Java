// string lengths

public class Strings {
    public static void main(String[] args) {
        // String ninja = "Coding Dojo is awesome!";
        // int length = ninja.length();
        // System.out.println( "String Length is : " + length);

        // Concatenate strings

        String string1 = "My name is ";
        String string2 = "Jordan";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // format strings

        String ninja1 = String.format("Hi %s, you owe me $%.2f !", "Yogi", 2555.90);
        System.out.println(ninja1);

        // indexof(-1 means not found)

        // String ninja = "Welcome to Coding Dojo!";
        // int a = ninja.indexOf("Coding");
        // System.out.println(a);
        // int b = ninja.indexOf("!");
        // System.out.println(b);
        // int c = ninja.indexOf("world");
        // System.out.println(c);

        // trim strings

        String sentence = "       look at all this space      ";
        System.out.println(sentence.trim());

        // UPPERCASE and lowercase

        // String a = "HELLO";
        // String b = "world";
        // System.out.println(a.toLowerCase());
        // System.out.println(b.toUpperCase());

        // Equality

        String a = "same string";
        String b = "same string";
        System.out.println(a == b);

        a = new String("same letters");
        b = new String("same letters");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}


