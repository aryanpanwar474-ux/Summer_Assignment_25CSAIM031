// Q82 - Reverse a String
// Companies: Microsoft, Adobe, Paytm

import java.util.Scanner;

public class Q82_ReverseString {
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
        sc.close();
    }
}