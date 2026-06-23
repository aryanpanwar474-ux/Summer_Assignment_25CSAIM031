// Q81 - Find String Length Without strlen()
// Companies: Microsoft, Adobe, Paytm

import java.util.Scanner;

public class Q81_StringLength {
    public static int stringLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = stringLength(str);
        System.out.println("String: \"" + str + "\"");
        System.out.println("Length (without using length()): " + length);
        sc.close();
    }
}