import java.util.Scanner;

public class Q7_ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        long product = 1;
        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }
        System.out.println("Product of digits: " + product);
    }
}