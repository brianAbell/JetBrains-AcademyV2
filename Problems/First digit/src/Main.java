import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int firstDig = num;

        if (firstDig >= 10) {
            System.out.println(firstDig / 10);
        }
    }
}