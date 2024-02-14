import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 45};
        int[] arr2 = {1, 2, 3};
        int[] combined = combine(arr1, arr2);
        System.out.println(Arrays.toString(combined)); // Output: [11, 1, 22, 2, 33, 3, 45]
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        List<Integer> combinedList = new ArrayList<>();
        int maxLength = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                combinedList.add(arr1[i]);
            }
            if (i < arr2.length) {
                combinedList.add(arr2[i]);
            }
        }
        int[] combinedArray = new int[combinedList.size()];
        for (int i = 0; i < combinedList.size(); i++) {
            combinedArray[i] = combinedList.get(i);
        }
        return combinedArray;
    }
}
