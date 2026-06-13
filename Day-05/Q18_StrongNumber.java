// Q18 - Check Strong Number
// A strong number equals the sum of factorials of its digits
// Example: 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145 → Strong!

import java.util.Scanner;

public class Q18_StrongNumber {

    static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is NOT a Strong Number.");
        }

        sc.close();
    }
}