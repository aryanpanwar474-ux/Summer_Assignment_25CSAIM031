import java.util.Scanner;

public class Q14_NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (n == 1) {
            System.out.println("The " + n + "th Fibonacci term is: 0");
        } else if (n == 2) {
            System.out.println("The " + n + "th Fibonacci term is: 1");
        } else {
            long a = 0, b = 1;
            for (int i = 3; i <= n; i++) {
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println("The " + n + "th Fibonacci term is: " + b);
        }
        sc.close();
    }
}