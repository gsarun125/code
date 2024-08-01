package jan.Day15;

import java.util.HashMap;
import java.util.Map;

/*
75.Print second frequently occurring number in given series
Example :
Input: 1 1 2 3 1 2 4
Output: 2
Explanation: 1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time and 4 occurs 1 time. Hence second frequently occurring number in given series is 2

 */
public class Qus75 {
    public static void main(String[] args) {
        int[] series = {1, 1, 2, 3, 1, 2, 4};
        int result = findSecondFrequentNumber(series);
        System.out.println(result);
    }

    private static int findSecondFrequentNumber(int[] series) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : series) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int frequency : frequencyMap.values()) {
            if (frequency > max1) {
                max2 = max1;
                max1 = frequency;
            } else if (frequency > max2 && frequency != max1) {
                max2 = frequency;
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == max2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
