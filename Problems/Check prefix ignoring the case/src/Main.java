import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(checker(args));
    }

    public static boolean checker(String[] place) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input.startsWith("J") || input.startsWith("j");
    }
}