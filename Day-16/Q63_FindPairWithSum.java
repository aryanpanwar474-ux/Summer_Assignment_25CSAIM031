import java.util.*;

public class Q63_FindPairWithSum {
    static int[] findPairWithSum(int[] arr, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (seen.containsKey(complement)) {
                return new int[]{complement, arr[i]};
            }
            seen.put(arr[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Array  : " + Arrays.toString(arr));
        System.out.println("Target : " + target);
        int[] pair = findPairWithSum(arr, target);
        if (pair.length > 0)
            System.out.println("Pair   : " + Arrays.toString(pair));
        else
            System.out.println("No pair found.");
    }
}