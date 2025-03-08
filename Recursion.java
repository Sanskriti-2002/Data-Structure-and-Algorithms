public class Recursion {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        printNumber(n - 1);
        System.out.print(n + " ");
    }

    public static void printNumberReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumberReverse(n - 1);
    }

    // public static int sumOfNumbers(int n) {
    // if (n == 0) {
    // return 0;
    // }
    // int sum = n + sumOfNumbers(n - 1);
    // return sum;
    // }

    // public static void sumOfNumbers(int n, int sum) {
    // if (n == 0) {
    // System.out.println(sum);
    // return;
    // }
    // sum = sum + n;
    // sumOfNumbers(n - 1, sum);
    // }

    // public static int factorial(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // int fact = n * factorial(n - 1);
    // return fact;
    // }

    // public static void printFibonacci(int first, int second, int n) {
    // if (n == 0) {
    // return;
    // }
    // int number = first + second;
    // System.out.print(number + " ");
    // printFibonacci(second, number, n - 1);
    // }

    public static int nthpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int power = x * nthpower(x, n - 1);
        return power;
    }

    public static int lognthpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return lognthpower(x, n / 2) * lognthpower(x, n / 2);
        } else {
            return lognthpower(x, n / 2) * lognthpower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int n = 2;
        // printNumber(n);
        // printNumberReverse(n);

        // int result = sumOfNumbers(n);
        // System.out.println(result);

        // int sum = 0;
        // sumOfNumbers(n, sum);

        // int fact = factorial(n);
        // System.out.println(fact);

        // int first = 0, second = 1;
        // System.out.print(first + " " + second + " ");
        // printFibonacci(0, 1, n - 2);

        // int x = 3;
        // int result = nthpower(x, n);
        // System.out.println(result);

        // int x = 3;
        // int result = lognthpower(x, n);
        // System.out.println(result);

    }
}
