public class Q39 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // increasing part: 1 2 3 ... i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decreasing part: i-1 ... 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}