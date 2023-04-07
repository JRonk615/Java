public final class MethodsFile {

    public static void main(String[] args){
        System.out.println(greeter("Jordan"));
    }
    public static String greeter(String name) {
        String firstName = name;
        return String.format("Hello %s, how are you today?", firstName);
    }
}