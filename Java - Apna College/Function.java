import java.util.*;

public class Function {
    // public static void MyName(String name) {
    // System.out.println(name);
    // return;
    // }

    // public static int calculateSum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }

    public static int calculateFact(int n) {
        if (n < 0) {
            System.out.println("Invalid");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // MyName(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int result = calculateSum(a, b);
        // System.out.println(result);

        int n = sc.nextInt();
        int result = calculateFact(n);
        System.out.println(result);

        sc.close();
    }
}
