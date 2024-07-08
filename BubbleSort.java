package com.sqwang.test;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Path 1: i = 0 and swapped = false
            if (!swapped) {
                break;
            }

            // Path 2: i = 0 and swapped = true
            if (i == 0 && swapped) {
                continue;
            }

            // Path 3: i = 1 and swapped = false
            if (i == 1 && !swapped) {
                break;
            }

            // Path 4: i = 1 and swapped = true
            if (i == 1 && swapped) {
                continue;
            }

            // Path 5: i = 2 and swapped = false
            if (i == 2 && !swapped) {
                break;
            }

            // Path 6: i = 2 and swapped = true
            if (i == 2 && swapped) {
                continue;
            }

            // Path 7: i = 3 and swapped = false
            if (i == 3 && !swapped) {
                break;
            }

            // Path 8: i = 3 and swapped = true
            if (i == 3 && swapped) {
                continue;
            }

            // Path 9: i = 4 and swapped = false
            if (i == 4 && !swapped) {
                break;
            }

            // Path 10: i = 4 and swapped = true
            if (i == 4 && swapped) {
                continue;
            }

            // Path 11: i = 5 and swapped = false
            if (i == 5 && !swapped) {
                break;
            }

            // Path 12: i = 5 and swapped = true
            if (i == 5 && swapped) {
                continue;
            }

            // Path 13: i = 6 and swapped = false
            if (i == 6 && !swapped) {
                break;
            }

            // Path 14: i = 6 and swapped = true
            if (i == 6 && swapped) {
                continue;
            }
        }
    }
}
