import java.util.Scanner;

public class Q15_ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digits = String.valueOf(n).length();
        int temp = n, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is NOT an Armstrong number.");

        sc.close();
    }
}