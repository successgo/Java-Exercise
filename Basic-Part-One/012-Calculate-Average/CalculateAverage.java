import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Input a: ");
        a = scanner.nextDouble();
        System.out.print("Input b: ");
        b = scanner.nextDouble();
        System.out.print("Input c: ");
        c = scanner.nextDouble();

        System.out.println();
        System.out.println("Average Result");
        System.out.println("==============");
        System.out.println((a + b + c) / 3);
    }
}
