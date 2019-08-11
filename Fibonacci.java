public class Fibonacci
{
    public static void main(String[] args) {
        int n = 10;
        long a = 0, b = 1, c = 1;

        for (int i=1; i<=n; i++) {
            System.out.print(c+(i<n?", ":""));
            c = a + b;
            a = b;
            b = c;
        }
    }
}