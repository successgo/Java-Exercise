import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Input a number x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("Result");
        System.out.println("======");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}
