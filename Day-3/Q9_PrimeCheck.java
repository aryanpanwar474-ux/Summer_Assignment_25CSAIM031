import java.util.Scanner;

public class Q9_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(n + " is NOT prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(n + (isPrime ? " is PRIME." : " is NOT prime."));
        }
        sc.close();
    }
}