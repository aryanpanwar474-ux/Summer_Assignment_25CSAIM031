// Q83 - Count Vowels and Consonants
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q83_VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("String     : " + str);
        System.out.println("Vowels     : " + vowels);
        System.out.println("Consonants : " + consonants);
        sc.close();
    }
}