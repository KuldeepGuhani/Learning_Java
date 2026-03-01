package Coding_Questions.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(removeDuplicateArr(arr)));
        // System.out.println(uniqueEle(arr));

    }

    private static int uniqueEle(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    private static int[] removeDuplicateArr(int[] arr) {
        if (arr.length == 0) {
            System.out.println("0");
        }
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, j);
    }
}
