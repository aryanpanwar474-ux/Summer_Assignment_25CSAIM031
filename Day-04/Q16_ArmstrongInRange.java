import java.util.Scanner;

public class Q16_ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int n = start; n <= end; n++) {
            int digits = String.valueOf(n).length();
            int temp = n, sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == n) System.out.print(n + " ");
        }
        System.out.println();
        sc.close();
    }
}