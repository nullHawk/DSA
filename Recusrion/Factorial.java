public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }

    public static int factorial(int n) {
        // Base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: Call the factorial function with a smaller input
            return n * factorial(n - 1);
        }
    }
}
