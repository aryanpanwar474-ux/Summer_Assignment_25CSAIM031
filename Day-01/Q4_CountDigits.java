import java.util.Scanner;

public class Q4_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        n = Math.abs(n); // Handle negative numbers
        int count = 0;

        if (n == 0) {
            count = 1; // 0 has 1 digit
        } else {
            while (n > 0) {
                n /= 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}