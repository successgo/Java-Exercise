import java.util.Scanner;

public class InputProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.print("Input first number: ");
        x = scanner.nextInt();
        System.out.print("Input second number: ");
        y = scanner.nextInt();

        long a = x;
        long b = y;

        System.out.println();
        System.out.println(x + " x " + y + " = " + x * y);
        System.out.println(x + " x " + y + " = " + a * b);
    }
}
