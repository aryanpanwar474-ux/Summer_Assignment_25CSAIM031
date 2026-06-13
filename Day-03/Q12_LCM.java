import java.util.Scanner;

public class Q12_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // LCM formula: (a * b) / GCD(a, b)
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        long lcm = (long) a * b / x;
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
        sc.close();
    }
}