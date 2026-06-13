public class Q40 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // increasing part: A B C ... up to i-th letter
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            // decreasing part: back to A
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}