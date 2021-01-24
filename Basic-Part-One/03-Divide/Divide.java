import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        System.out.println(50 / 3);
        // System.out.println(50/0); // will cause ArithmeticException

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        int x = scanner.nextInt();
        System.out.print("Please input number: ");
        int y = scanner.nextInt();
        try {
            int result = x / y;
            System.out.println();
            System.out.println("x/y = " + result);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("computation error, please check!");
        }
    }
}
