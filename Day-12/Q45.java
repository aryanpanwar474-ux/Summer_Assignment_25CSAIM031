import java.util.Scanner;

public class Q45 {
    static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " is " + (isPalindrome(n) ? "Palindrome" : "Not Palindrome"));
    }
}