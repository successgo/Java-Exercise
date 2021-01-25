import java.util.Scanner;

public class ComputeRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, length;
        double perimeter, area;

        System.out.print("Input length: ");
        length = scanner.nextDouble();
        System.out.print("Input width: ");
        width = scanner.nextDouble();

        perimeter = 2 * (length + width);
        area = length * width;

        System.out.println();
        System.out.println("Result");
        System.out.println("======");
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
