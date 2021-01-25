import java.util.Scanner;

public class InputOperation {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x: ");
        x = scanner.nextInt();
        System.out.print("Input y: ");
        y = scanner.nextInt();

        long a = x;
        long b = y;

        System.out.println();
        System.out.println("Result");
        System.out.println("======");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
