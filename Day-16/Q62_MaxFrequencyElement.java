import java.util.*;

public class Q62_MaxFrequencyElement {
    static int maxFrequencyElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0, result = arr[0];
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 3, 1, 2, 3};
        System.out.println("Array            : " + Arrays.toString(arr));
        System.out.println("Max Freq Element : " + maxFrequencyElement(arr));
    }
}