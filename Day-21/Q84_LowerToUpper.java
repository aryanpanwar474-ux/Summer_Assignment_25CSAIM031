// Q84 - Convert Lowercase to Uppercase (without toUpperCase())
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q84_LowerToUpper {
    public static String toUpperCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            // ASCII difference between 'a' and 'A' is 32
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = toUpperCase(str);
        System.out.println("Original  : " + str);
        System.out.println("Uppercase : " + upper);
        sc.close();
    }
}