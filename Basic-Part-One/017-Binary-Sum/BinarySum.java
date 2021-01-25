import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input binary number a: ");
        a = scanner.nextInt(2);
        System.out.print("Input binary number b: ");
        b = scanner.nextInt(2);

        System.out.println("Sum of two binary number is: " + Integer.toBinaryString((a + b)));
    }
}
