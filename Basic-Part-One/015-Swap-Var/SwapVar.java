public class SwapVar {
    public static void main(String[] args) {
        int a, b, c;

        a = 3;
        b = 4;

        System.out.println("Swap before");
        System.out.println("===========");
        System.out.println("a = " + a + ", b = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println();
        System.out.println("Swap over");
        System.out.println("=========");
        System.out.println("a = " + a + ", b = " + b);
    }
}
