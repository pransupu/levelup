public class Fibonacci
{

    private static void linear(int n) {
        long a = 0, b = 1, c = 1;

        for (int i=1; i<=n; i++) {
            System.out.print(c+(i<n?", ":""));
            c = a + b;
            a = b;
            b = c;
        }
    }

    private static long recursive(int n) {
        if (n < 2) {
            return n;
        }
        long sum = recursive(n - 1) + recursive(n - 2);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci series using linear algorithm -");
        linear(n);
        System.out.println();
        System.out.println();
        System.out.println("Fibonacci series using recursive algorithm -");
        long f = recursive(n);
        System.out.println("Fibonacci #"+n+": "+f);
    }
}