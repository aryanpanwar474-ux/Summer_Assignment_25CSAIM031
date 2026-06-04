import java.util.Scanner;

public class Q8_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0, temp = Math.abs(num);
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        if (original == reversed)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is NOT a Palindrome.");
    }
}