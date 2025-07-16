package package2;

public class FibonacciRecursive {
    public static long fib(int n) {
        if (n < 2) return n;               // base cases: F0 = 0, F1 = 1
        return fib(n - 1) + fib(n - 2);    // exponential time!
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("F(" + n + ") = " + fib(n));
    }
}

