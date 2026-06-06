import java.util.Scanner;

public class Q10_PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int n = start; n <= end; n++) {
            if (n < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { isPrime = false; break; }
            }
            if (isPrime) System.out.print(n + " ");
        }
        System.out.println();
        sc.close();
    }
}