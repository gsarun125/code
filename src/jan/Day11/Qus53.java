package jan.Day11;

import java.util.HashMap;
import java.util.Map;

/*
53.Given an array with repeated numbers, Find the top three repeated numbers.
input: array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
output: 3, 16, 15

 */
public class Qus53 {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        int[] topThreeRepeated = findTopThreeRepeatedNumber(array);

        for (int ans : topThreeRepeated) {
            System.out.println(ans);
        }
    }

    private static int[] findTopThreeRepeatedNumber(int[] array) {
        Map<Integer, Integer> frequenceMap = new HashMap<>();
        for (int num : array) {
            //getOrDefault method in the frequencyMap is used to retrieve the current frequency of a number in the map.
            frequenceMap.put(num, frequenceMap.getOrDefault(num, 0) + 1);
        }
        int[] topthreeRepeate = {0, 0, 0};
        //get map values
        for (Map.Entry<Integer, Integer> entry : frequenceMap.entrySet()) {
            int currentFrequency = entry.getValue();
            //if currentFrequency is grater the replace;
            if (currentFrequency > topthreeRepeate[0]) {
                topthreeRepeate[2] = topthreeRepeate[1];
                topthreeRepeate[1] = topthreeRepeate[0];
                topthreeRepeate[0] = entry.getKey();
            } else if (currentFrequency > topthreeRepeate[1]) {
                topthreeRepeate[2] = topthreeRepeate[1];
                topthreeRepeate[1] = entry.getKey();
            } else if (currentFrequency > topthreeRepeate[2]) {
                topthreeRepeate[2] = entry.getKey();
            }
        }
        return topthreeRepeate;
    }
}
