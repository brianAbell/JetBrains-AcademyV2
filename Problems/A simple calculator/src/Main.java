import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long y = scanner.nextLong();

        switch (operator) {
            case '+':
                System.out.print(x + y);
                break;

            case '-':
                System.out.print(x - y);
                break;

            case '/':
                if (y == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(x / y);
                }
                break;

            case '*':
                System.out.print(x * y);
                break;

            default:
                System.out.print("Unknown operator");
        }
    }
}