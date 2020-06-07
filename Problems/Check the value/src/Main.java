import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(checker(input));
    }

    public static boolean checker(int input) {
        return input < 10;
    }
}