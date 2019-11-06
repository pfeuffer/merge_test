import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Expect nothing more to happen.");
        System.out.println("Parameters:");
        Arrays.stream(args).map(arg -> "- " + arg).forEach(System.out::println);
    }
}
