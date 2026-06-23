import java.util.*;

public class Q67_IntersectionOfArrays {
    static int[] intersectionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num); // avoid duplicates
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.println("Array 1       : " + Arrays.toString(arr1));
        System.out.println("Array 2       : " + Arrays.toString(arr2));
        System.out.println("Intersection  : " + Arrays.toString(intersectionOfArrays(arr1, arr2)));
    }
}